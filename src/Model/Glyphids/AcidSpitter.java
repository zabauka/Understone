package Model.Glyphids;

import Model.Weapon;

public class AcidSpitter extends Glyphid {
    public AcidSpitter(String theName, double theX, double theY, int theHealth,
                       double theWidth, double theHeight, double theMoveSpeed,
                       Weapon theWeapon, int fireTimer) {
        super(theName, theX, theY, theHealth, theWidth, theHeight, theMoveSpeed, theWeapon, fireTimer);
    }

    @Override
    public void attack() {
        // projectile attack logic
        System.out.println("Acid Spitter attacks.");
    }

    @Override
    public void update() {
        // update logic for Acid Spitter
        updateFireTimer();
    }
}
