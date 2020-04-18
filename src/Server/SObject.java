package Server;

public abstract class SObject {
    int handle;

    public int getHandle() {
        return handle;
    }
    public void setHandle(int value) {
        this.handle = value;
    }

    public SObject() {
        handle = SObjectManager.register(this);
    }

    public abstract boolean setAttributeValue(String attributeName, String value);
    public abstract String getAttributeValue(String attributeName);
    public abstract String executeMethod(String methodName, String params);
}
