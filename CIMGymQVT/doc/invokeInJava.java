// Refer to an existing transformation via URI
URI transformationURI = URI.createURI("platform:/resources/myqvtprj/ChangeTheWorld.qvto");
// create executor for the given transformation
TransformationExecutor executor = new TransformationExecutor(transformationURI);

// define the transformation input
// Remark: we take the objects from a resource, however
// a list of arbitrary in-memory EObjects may be passed
Resource inResource = resourceSet.getResource(
        URI.createURI("platform:/resources/myqvtprj/today.world"), true);
EList<EObject> inObjects = inResource.getContents();

// create the input extent with its initial contents
ModelExtent input = new BasicModelExtent(inObjects);
// create an empty extent to catch the output
ModelExtent output = new BasicModelExtent();

// setup the execution environment details ->
// configuration properties, logger, monitor object etc.
ExecutionContextImpl context = new ExecutionContextImpl();
context.setConfigProperty("keepModeling", true);

// run the transformation assigned to the executor with the given
// input and output and execution context -> ChangeTheWorld(in, out)
// Remark: variable arguments count is supported
ExecutionDiagnostic result = executor.execute(context, input, output);

// check the result for success
if(result.getSeverity() == Diagnostic.OK) {
    // the output objects got captured in the output extent
    List<EObject> outObjects = output.getContents();
    // let's persist them using a resource
    Resource outResource = resourceSet.getResource(
            URI.createURI("platform:/resources/myqvtprj/tomorrow.betterWorld"), true);
    outResource.getContents().addAll(outObjects);
    outResource.save(Collections.emptyMap());
} else {
    // turn the result diagnostic into status and send it to error log
    IStatus status = BasicDiagnostic.toIStatus(result);
    Activator.getDefault().getLog().log(status);
}