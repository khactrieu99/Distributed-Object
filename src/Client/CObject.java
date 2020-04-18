package Client;

public abstract class CObject {
    protected int handle;

    public void createObject(String className) {
        handle = CObjectManager.createRemoteObject(className);
    }

    public int getHandle() {
        return handle;
    }
    public void setHandle(int handle) {
        this.handle = handle;
    }

    public boolean setAttributeValue(String attributeName, String value) {
        return CObjectManager.setAttributeValue(handle, attributeName, value);
    }
    public String getAttributeValue(String attributeName) {
        return CObjectManager.getAttributeValue(handle, attributeName);
    }
    public String executeMethod(String methodName, String params) {
        return CObjectManager.executeMethod(handle, methodName, params);
    }
}
