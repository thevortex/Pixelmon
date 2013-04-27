// Date: 2/19/2013 3:58:44 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.EnumArm;
import pixelmon.client.models.animations.EnumLeg;
import pixelmon.client.models.animations.EnumPhase;
import pixelmon.client.models.animations.ModuleArm;
import pixelmon.client.models.animations.ModuleLeg;
import pixelmon.client.models.animations.biped.SkeletonBiped;

public class ModelPoliwhirl extends PixelmonModelBase {
	// fields
	PixelmonModelRenderer Body;

	public ModelPoliwhirl() {
		textureWidth = 64;
		textureHeight = 32;

		Body = new PixelmonModelRenderer(this, "Body");
		Body.setRotationPoint(0, 17.5F, 0.5F);
		PixelmonModelRenderer MainBody = new PixelmonModelRenderer(this, 16, 12);
		MainBody.addBox(-3.5F, -3.5F, -2.5F, 7, 7, 5);
		MainBody.setTextureSize(64, 32);
		MainBody.mirror = true;
		setRotation(MainBody, 0F, 0F, 0F);
		PixelmonModelRenderer Belly = new PixelmonModelRenderer(this, 0, 17);
		Belly.addBox(-3F, -3F, -3F, 6, 6, 1);
		Belly.setTextureSize(64, 32);
		Belly.mirror = true;
		setRotation(Belly, 0F, 0F, 0F);
		PixelmonModelRenderer Body1 = new PixelmonModelRenderer(this, 0, 0);
		Body1.addBox(-3F, -3F, 2F, 6, 6, 1);
		Body1.setTextureSize(64, 32);
		Body1.mirror = true;
		setRotation(Body1, 0F, 0F, 0F);
		PixelmonModelRenderer Body2 = new PixelmonModelRenderer(this, 0, 0);
		Body2.addBox(3F, -3F, -2F, 1, 6, 4);
		Body2.setTextureSize(64, 32);
		Body2.mirror = true;
		setRotation(Body2, 0F, 0F, 0F);
		PixelmonModelRenderer Body3 = new PixelmonModelRenderer(this, 0, 0);
		Body3.addBox(-4F, -3F, -2F, 1, 6, 4);
		Body3.setTextureSize(64, 32);
		Body3.mirror = true;
		setRotation(Body3, 0F, 0F, 0F);
		PixelmonModelRenderer Body4 = new PixelmonModelRenderer(this, 0, 0);
		Body4.addBox(3.5F, -2.5F, -1.5F, 1, 5, 3);
		Body4.setTextureSize(64, 32);
		Body4.mirror = true;
		setRotation(Body4, 0F, 0F, 0F);
		PixelmonModelRenderer Body5 = new PixelmonModelRenderer(this, 0, 0);
		Body5.addBox(-4.5F, -2.5F, -1.5F, 1, 5, 3);
		Body5.setTextureSize(64, 32);
		Body5.mirror = true;
		setRotation(Body5, 0F, 0F, 0F);
		PixelmonModelRenderer Body6 = new PixelmonModelRenderer(this, 0, 0);
		Body6.addBox(-3F, -4F, -2F, 6, 1, 4);
		Body6.setTextureSize(64, 32);
		Body6.mirror = true;
		setRotation(Body6, 0F, 0F, 0F);
		PixelmonModelRenderer Body7 = new PixelmonModelRenderer(this, 0, 0);
		Body7.addBox(-3F, 3F, -2F, 6, 1, 4);
		Body7.setTextureSize(64, 32);
		Body7.mirror = true;
		setRotation(Body7, 0F, 0F, 0F);
		PixelmonModelRenderer Body8 = new PixelmonModelRenderer(this, 0, 0);
		Body8.addBox(-2.5F, -4.2F, -1.5F, 5, 1, 3);
		Body8.setTextureSize(64, 32);
		Body8.mirror = true;
		setRotation(Body8, 0F, 0F, 0F);
		PixelmonModelRenderer Body9 = new PixelmonModelRenderer(this, 0, 0);
		Body9.addBox(-2.5F, 3.3F, -1.45F, 5, 1, 3);
		Body9.setTextureSize(64, 32);
		Body9.mirror = true;
		setRotation(Body9, 0F, 0F, 0F);
		PixelmonModelRenderer REyeMain = new PixelmonModelRenderer(this, 0, 25);
		REyeMain.addBox(-3F, -5.5F, -1.9F, 2, 2, 1);
		REyeMain.setTextureSize(64, 32);
		REyeMain.mirror = true;
		setRotation(REyeMain, 0F, 0F, 0F);
		PixelmonModelRenderer REye1 = new PixelmonModelRenderer(this, 0, 0);
		REye1.addBox(2.6F, 3.1F, -1.8F, 1, 2, 1);
		REye1.setTextureSize(64, 32);
		REye1.mirror = true;
		setRotation(REye1, 0F, 0F, -3.054326F);
		PixelmonModelRenderer REye2 = new PixelmonModelRenderer(this, 0, 0);
		REye2.addBox(0.4F, 3.5F, -1.8F, 1, 2, 1);
		REye2.setTextureSize(64, 32);
		REye2.mirror = true;
		setRotation(REye2, 0F, 0F, 3.054326F);
		PixelmonModelRenderer REye3 = new PixelmonModelRenderer(this, 0, 0);
		REye3.addBox(-3F, -4F, -3.4F, 2, 2, 2);
		REye3.setTextureSize(64, 32);
		REye3.mirror = true;
		setRotation(REye3, -0.5235988F, 0F, 0F);
		PixelmonModelRenderer LEyeMain = new PixelmonModelRenderer(this, 6, 25);
		LEyeMain.addBox(1F, -5.5F, -1.9F, 2, 2, 1);
		LEyeMain.setTextureSize(64, 32);
		LEyeMain.mirror = true;
		setRotation(LEyeMain, 0F, 0F, 0F);
		PixelmonModelRenderer LEye1 = new PixelmonModelRenderer(this, 0, 0);
		LEye1.addBox(-1.4F, 3.5F, -1.8F, 1, 2, 1);
		LEye1.setTextureSize(64, 32);
		LEye1.mirror = true;
		setRotation(LEye1, 0F, 0F, -3.054326F);
		PixelmonModelRenderer LEye2 = new PixelmonModelRenderer(this, 0, 0);
		LEye2.addBox(-3.6F, 3.1F, -1.8F, 1, 2, 1);
		LEye2.setTextureSize(64, 32);
		LEye2.mirror = true;
		setRotation(LEye2, 0F, 0F, 3.054326F);
		PixelmonModelRenderer LEye3 = new PixelmonModelRenderer(this, 0, 0);
		LEye3.addBox(1F, -4F, -3.4F, 2, 2, 2);
		LEye3.setTextureSize(64, 32);
		LEye3.mirror = true;
		setRotation(LEye3, -0.5235988F, 0F, 0F);
		Body.addChild(MainBody);
		Body.addChild(Belly);
		Body.addChild(Body1);
		Body.addChild(Body2);
		Body.addChild(Body3);
		Body.addChild(Body4);
		Body.addChild(Body5);
		Body.addChild(Body6);
		Body.addChild(Body7);
		Body.addChild(Body8);
		Body.addChild(Body9);
		Body.addChild(REyeMain);
		Body.addChild(REye1);
		Body.addChild(REye2);
		Body.addChild(REye3);
		Body.addChild(LEyeMain);
		Body.addChild(LEye1);
		Body.addChild(LEye2);
		Body.addChild(LEye3);

		PixelmonModelRenderer LeftLegPiece = new PixelmonModelRenderer(this,
				"Left Leg");
		LeftLegPiece.setRotationPoint(1.5F, 3.5F, -0.5F);
		PixelmonModelRenderer LeftLeg = new PixelmonModelRenderer(this, 0, 0);
		LeftLeg.addBox(-0.5F, 0F, 0F, 1, 3, 1);
		LeftLeg.setTextureSize(64, 32);
		LeftLeg.mirror = true;
		setRotation(LeftLeg, 0F, 0F, 0F);
		PixelmonModelRenderer LFoot1 = new PixelmonModelRenderer(this, 0, 0);
		LFoot1.addBox(-0.5F, 2F, -2F, 1, 1, 3);
		LFoot1.setTextureSize(64, 32);
		LFoot1.mirror = true;
		setRotation(LFoot1, 0F, 0F, 0F);
		PixelmonModelRenderer LFoot2 = new PixelmonModelRenderer(this, 0, 0);
		LFoot2.addBox(-0.2F, 2F, -1.1F, 1, 1, 3);
		LFoot2.setTextureSize(64, 32);
		LFoot2.mirror = true;
		setRotation(LFoot2, 0F, -2.879793F, 0F);
		PixelmonModelRenderer LFoot3 = new PixelmonModelRenderer(this, 0, 0);
		LFoot3.addBox(-0.7F, 2F, -0.9F, 1, 1, 3);
		LFoot3.setTextureSize(64, 32);
		LFoot3.mirror = true;
		setRotation(LFoot3, 0F, 2.932153F, 0F);
		PixelmonModelRenderer LFoot4 = new PixelmonModelRenderer(this, 0, 0);
		LFoot4.addBox(-0.9F, 2F, -0.7F, 1, 1, 1);
		LFoot4.setTextureSize(64, 32);
		LFoot4.mirror = true;
		setRotation(LFoot4, 0F, 2.70526F, 0F);
		PixelmonModelRenderer LFoot5 = new PixelmonModelRenderer(this, 0, 0);
		LFoot5.addBox(-2F, 2F, 0.8F, 1, 1, 1);
		LFoot5.setTextureSize(64, 32);
		LFoot5.mirror = true;
		setRotation(LFoot5, 0F, -2.530727F, 0F);
		PixelmonModelRenderer LFoot6 = new PixelmonModelRenderer(this, 0, 0);
		LFoot6.addBox(-0.8F, 2F, -2.6F, 1, 1, 1);
		LFoot6.setTextureSize(64, 32);
		LFoot6.mirror = true;
		setRotation(LFoot6, 0F, 0F, 0F);
		PixelmonModelRenderer LFoot7 = new PixelmonModelRenderer(this, 0, 0);
		LFoot7.addBox(-0.4F, 2F, -2.6F, 1, 1, 1);
		LFoot7.setTextureSize(64, 32);
		LFoot7.mirror = true;
		setRotation(LFoot7, 0F, 0F, 0F);
		LeftLegPiece.addChild(LeftLeg);
		LeftLegPiece.addChild(LFoot1);
		LeftLegPiece.addChild(LFoot2);
		LeftLegPiece.addChild(LFoot3);
		LeftLegPiece.addChild(LFoot4);
		LeftLegPiece.addChild(LFoot5);
		LeftLegPiece.addChild(LFoot6);
		LeftLegPiece.addChild(LFoot7);
		Body.addChild(LeftLegPiece);

		PixelmonModelRenderer RightLegPiece = new PixelmonModelRenderer(this,
				"Right Leg");
		RightLegPiece.setRotationPoint(-1.5F, 3.5F, -0.5F);
		PixelmonModelRenderer RightLeg = new PixelmonModelRenderer(this, 0, 0);
		RightLeg.addBox(-0.5F, 0F, 0F, 1, 3, 1);
		RightLeg.setTextureSize(64, 32);
		RightLeg.mirror = true;
		setRotation(RightLeg, 0F, 0F, 0F);
		PixelmonModelRenderer RFoot1 = new PixelmonModelRenderer(this, 0, 0);
		RFoot1.addBox(-0.5F, 2F, -3F, 1, 1, 3);
		RFoot1.setTextureSize(64, 32);
		RFoot1.mirror = true;
		setRotation(RFoot1, 0F, 0F, 0F);
		PixelmonModelRenderer RFoot2 = new PixelmonModelRenderer(this, 0, 0);
		RFoot2.addBox(-0.6F, 2F, -0.7F, 1, 1, 3);
		RFoot2.setTextureSize(64, 32);
		RFoot2.mirror = true;
		setRotation(RFoot2, 0F, 2.932153F, 0F);
		PixelmonModelRenderer RFoot3 = new PixelmonModelRenderer(this, 0, 0);
		RFoot3.addBox(-0.3F, 2F, -0.4F, 1, 1, 3);
		RFoot3.setTextureSize(64, 32);
		RFoot3.mirror = true;
		setRotation(RFoot3, 0F, -2.80998F, 0F);
		PixelmonModelRenderer RFoot4 = new PixelmonModelRenderer(this, 0, 0);
		RFoot4.addBox(1.5F, 2F, 1F, 1, 1, 1);
		RFoot4.setTextureSize(64, 32);
		RFoot4.mirror = true;
		setRotation(RFoot4, 0F, 2.583087F, 0F);
		PixelmonModelRenderer RFoot5 = new PixelmonModelRenderer(this, 0, 0);
		RFoot5.addBox(-2.2F, 2F, 1.1F, 1, 1, 1);
		RFoot5.setTextureSize(64, 32);
		RFoot5.mirror = true;
		setRotation(RFoot5, 0F, -2.530727F, 0F);
		PixelmonModelRenderer RFoot6 = new PixelmonModelRenderer(this, 0, 0);
		RFoot6.addBox(-1F, 2F, -3F, 1, 1, 1);
		RFoot6.setTextureSize(64, 32);
		RFoot6.mirror = true;
		setRotation(RFoot6, 0F, 0F, 0F);
		RightLegPiece.addChild(RightLeg);
		RightLegPiece.addChild(RFoot1);
		RightLegPiece.addChild(RFoot2);
		RightLegPiece.addChild(RFoot3);
		RightLegPiece.addChild(RFoot4);
		RightLegPiece.addChild(RFoot5);
		RightLegPiece.addChild(RFoot6);
		Body.addChild(RightLegPiece);

		PixelmonModelRenderer LeftArmPiece = new PixelmonModelRenderer(this,
				"Left Arm");
		LeftArmPiece.setRotationPoint(4F, -1F, 0F);
		PixelmonModelRenderer LeftArm = new PixelmonModelRenderer(this, 29, 7);
		LeftArm.addBox(-0.5F, -0.5F, -0.5F, 3, 1, 1);
		LeftArm.setTextureSize(64, 32);
		LeftArm.mirror = true;
		setRotation(LeftArm, 0F, 0F, 0F);
		PixelmonModelRenderer LHandMain = new PixelmonModelRenderer(this, 29, 0);
		LHandMain.addBox(2F, -1F, -1F, 2, 2, 2);
		LHandMain.setTextureSize(64, 32);
		LHandMain.mirror = true;
		setRotation(LHandMain, 0F, 0F, 0F);
		PixelmonModelRenderer LHand1 = new PixelmonModelRenderer(this, 29, 0);
		LHand1.addBox(2.1F, 0.1F, -1.1F, 1, 1, 1);
		LHand1.setTextureSize(64, 32);
		LHand1.mirror = true;
		setRotation(LHand1, 0F, 0F, 0F);
		PixelmonModelRenderer LHand2 = new PixelmonModelRenderer(this, 29, 0);
		LHand2.addBox(3.2F, -1F, -1F, 1, 2, 2);
		LHand2.setTextureSize(64, 32);
		LHand2.mirror = true;
		setRotation(LHand2, 0F, 0F, 0F);
		PixelmonModelRenderer LHand3 = new PixelmonModelRenderer(this, 29, 0);
		LHand3.addBox(2.5F, -1.1F, -1F, 1, 1, 2);
		LHand3.setTextureSize(64, 32);
		LHand3.mirror = true;
		setRotation(LHand3, 0F, 0F, 0F);
		PixelmonModelRenderer LHand4 = new PixelmonModelRenderer(this, 29, 0);
		LHand4.addBox(3.2F, -1.1F, -1F, 1, 2, 2);
		LHand4.setTextureSize(64, 32);
		LHand4.mirror = true;
		setRotation(LHand4, 0F, 0F, 0F);
		PixelmonModelRenderer LHand5 = new PixelmonModelRenderer(this, 29, 0);
		LHand5.addBox(2.2F, -1F, 0.2F, 2, 2, 1);
		LHand5.setTextureSize(64, 32);
		LHand5.mirror = true;
		setRotation(LHand5, 0F, 0F, 0F);
		LeftArmPiece.addChild(LeftArm);
		LeftArmPiece.addChild(LHandMain);
		LeftArmPiece.addChild(LHand1);
		LeftArmPiece.addChild(LHand3);
		LeftArmPiece.addChild(LHand2);
		LeftArmPiece.addChild(LHand4);
		LeftArmPiece.addChild(LHand5);
		Body.addChild(LeftArmPiece);

		PixelmonModelRenderer RightArmPiece = new PixelmonModelRenderer(this,
				"Right Arm");
		RightArmPiece.setRotationPoint(-4F, -1F, 0F);
		PixelmonModelRenderer RightArm = new PixelmonModelRenderer(this, 29, 5);
		RightArm.addBox(-2.5F, -0.5F, -0.5F, 3, 1, 1);
		RightArm.setTextureSize(64, 32);
		RightArm.mirror = true;
		setRotation(RightArm, 0F, 0F, 0F);
		PixelmonModelRenderer RHandMain = new PixelmonModelRenderer(this, 29, 0);
		RHandMain.addBox(-4F, -1F, -1F, 2, 2, 2);
		RHandMain.setTextureSize(64, 32);
		RHandMain.mirror = true;
		setRotation(RHandMain, 0F, 0F, 0F);
		PixelmonModelRenderer RHand1 = new PixelmonModelRenderer(this, 29, 0);
		RHand1.addBox(-3.1F, 0.1F, -1.1F, 1, 1, 1);
		RHand1.setTextureSize(64, 32);
		RHand1.mirror = true;
		setRotation(RHand1, 0F, 0F, 0F);
		PixelmonModelRenderer RHand2 = new PixelmonModelRenderer(this, 29, 0);
		RHand2.addBox(-4.2F, -1F, -1F, 1, 2, 2);
		RHand2.setTextureSize(64, 32);
		RHand2.mirror = true;
		setRotation(RHand2, 0F, 0F, 0F);
		PixelmonModelRenderer RHand3 = new PixelmonModelRenderer(this, 29, 0);
		RHand3.addBox(-4.2F, -1.2F, -1F, 1, 1, 2);
		RHand3.setTextureSize(64, 32);
		RHand3.mirror = true;
		setRotation(RHand3, 0F, 0F, 0F);
		PixelmonModelRenderer RHand4 = new PixelmonModelRenderer(this, 29, 0);
		RHand4.addBox(-3.5F, -1.2F, -1F, 1, 1, 2);
		RHand4.setTextureSize(64, 32);
		RHand4.mirror = true;
		setRotation(RHand4, 0F, 0F, 0F);
		PixelmonModelRenderer RHand5 = new PixelmonModelRenderer(this, 29, 0);
		RHand5.addBox(-4.2F, -1F, 0.2F, 2, 2, 1);
		RHand5.setTextureSize(64, 32);
		RHand5.mirror = true;
		setRotation(RHand5, 0F, 0F, 0F);
		RightArmPiece.addChild(RightArm);
		RightArmPiece.addChild(RHandMain);
		RightArmPiece.addChild(RHand1);
		RightArmPiece.addChild(RHand2);
		RightArmPiece.addChild(RHand3);
		RightArmPiece.addChild(RHand4);
		RightArmPiece.addChild(RHand5);
		Body.addChild(RightArmPiece);

		ModuleArm leftArmModule = new ModuleArm(LeftArm, null, 0, 0);
		ModuleArm rightArmModule = new ModuleArm(RightArm, null, 0, 0);

		float legspeed = 0.65F;
		float legRotationLimit = 1.4F;

		ModuleLeg leftLegModule = new ModuleLeg(LeftLeg, EnumLeg.FrontLeft,
				EnumPhase.InPhase, legRotationLimit, legspeed);
		ModuleLeg rightLegModule = new ModuleLeg(RightLeg, EnumLeg.FrontRight,
				EnumPhase.InPhase, legRotationLimit, legspeed);

		skeleton = new SkeletonBiped(Body, null, leftArmModule, rightArmModule,
				leftLegModule, rightLegModule, null);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		Body.render(f5);
	}

	private void setRotation(PixelmonModelRenderer model, float x, float y,
			float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
