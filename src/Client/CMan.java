package Client;

public class CMan extends CObject {
    public CMan() {
        super.createObject("SMan");
    }

    // attribute: name
    public boolean setName(String name) {
        return super.setAttributeValue("Name", name);
    }
    public String getName() {
        return super.getAttributeValue("Name");
    }

    // attribute: height
    public boolean setHeight(int height) {
        return super.setAttributeValue("Height", String.valueOf(height));
    }
    public int getHeight() {
        String height = super.getAttributeValue("Height");
        return Integer.parseInt(height);
    }

    public String heightJugde() {
        return super.executeMethod("Height Jugde", "");
    }
}
