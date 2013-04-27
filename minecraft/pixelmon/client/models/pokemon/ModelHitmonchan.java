// Date: 4/12/2013 7:38:32 PM
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
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.ModuleLeg;
import pixelmon.client.models.animations.biped.SkeletonBiped;

public class ModelHitmonchan extends PixelmonModelBase
{
  //fields
    PixelmonModelRenderer ModelBody;
    
  
  public ModelHitmonchan()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      ModelBody = new PixelmonModelRenderer(this, "Body");
      ModelBody.setRotationPoint(0,0,-0.5F);
      PixelmonModelRenderer Body = new PixelmonModelRenderer(this, 22, 0);
      Body.addBox(-3.5F, -3F, -1.5F, 7, 6, 3);
      Body.setTextureSize(128, 64);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      PixelmonModelRenderer Waist = new PixelmonModelRenderer(this, 0, 0);
      Waist.addBox(0F, 0F, 0F, 7, 4, 4);
      Waist.setRotationPoint(-3.5F, 4F, -2F);
      Waist.setTextureSize(128, 64);
      Waist.mirror = true;
      setRotation(Waist, 0F, 0F, 0F);
      PixelmonModelRenderer Waist_Upper = new PixelmonModelRenderer(this, 0, 8);
      Waist_Upper.addBox(0F, 0F, 0F, 5, 1, 3);
      Waist_Upper.setRotationPoint(-2.5F, 3F, -1.5F);
      Waist_Upper.setTextureSize(128, 64);
      Waist_Upper.mirror = true;
      setRotation(Waist_Upper, 0F, 0F, 0F);
      PixelmonModelRenderer Shoulder_Left = new PixelmonModelRenderer(this, 0, 49);
      Shoulder_Left.addBox(0F, 0F, 0F, 5, 5, 4);
      Shoulder_Left.setRotationPoint(2F, -4F, -2F);
      Shoulder_Left.setTextureSize(128, 64);
      Shoulder_Left.mirror = true;
      setRotation(Shoulder_Left, 0F, 0F, 0F);
      PixelmonModelRenderer Shoulder_Pad_Top_Left = new PixelmonModelRenderer(this, 22, 17);
      Shoulder_Pad_Top_Left.addBox(0F, 0F, 0F, 5, 1, 4);
      Shoulder_Pad_Top_Left.setRotationPoint(5F, -4F, -2F);
      Shoulder_Pad_Top_Left.setTextureSize(128, 64);
      Shoulder_Pad_Top_Left.mirror = true;
      setRotation(Shoulder_Pad_Top_Left, 0F, 0F, -0.5235988F);
      PixelmonModelRenderer Shoulder_Pad_Front_Left = new PixelmonModelRenderer(this, 22, 26);
      Shoulder_Pad_Front_Left.addBox(0F, 0F, 0F, 4, 3, 1);
      Shoulder_Pad_Front_Left.setRotationPoint(5F, -4F, -2F);
      Shoulder_Pad_Front_Left.setTextureSize(128, 64);
      Shoulder_Pad_Front_Left.mirror = true;
      setRotation(Shoulder_Pad_Front_Left, 0F, 0F, -0.5235988F);
      PixelmonModelRenderer Shoulder_Pad_Back_Left = new PixelmonModelRenderer(this, 22, 30);
      Shoulder_Pad_Back_Left.addBox(0F, 0F, 0F, 4, 3, 1);
      Shoulder_Pad_Back_Left.setRotationPoint(5F, -4F, 1F);
      Shoulder_Pad_Back_Left.setTextureSize(128, 64);
      Shoulder_Pad_Back_Left.mirror = true;
      setRotation(Shoulder_Pad_Back_Left, 0F, 0F, -0.5235988F);
      PixelmonModelRenderer Shoulder_Right = new PixelmonModelRenderer(this, 0, 49);
      Shoulder_Right.addBox(0F, 0F, 0F, 5, 5, 4);
      Shoulder_Right.setRotationPoint(-7F, -4F, -2F);
      Shoulder_Right.setTextureSize(128, 64);
      Shoulder_Right.mirror = true;
      setRotation(Shoulder_Right, 0F, 0F, 0F);
      PixelmonModelRenderer Shoulder_Pad_Top_Right = new PixelmonModelRenderer(this, 22, 17);
      Shoulder_Pad_Top_Right.addBox(0F, 0F, 0F, 5, 1, 4);
      Shoulder_Pad_Top_Right.setRotationPoint(-9.2F, -6.5F, -2F);
      Shoulder_Pad_Top_Right.setTextureSize(128, 64);
      Shoulder_Pad_Top_Right.mirror = true;
      setRotation(Shoulder_Pad_Top_Right, 0F, 0F, 0.5235988F);
      PixelmonModelRenderer  Shoulder_Pad_Front_Right = new PixelmonModelRenderer(this, 22, 26);
      Shoulder_Pad_Front_Right.addBox(0F, 0F, 0F, 4, 3, 1);
      Shoulder_Pad_Front_Right.setRotationPoint(-8.3F, -5.9F, -2F);
      Shoulder_Pad_Front_Right.setTextureSize(128, 64);
      Shoulder_Pad_Front_Right.mirror = true;
      setRotation(Shoulder_Pad_Front_Right, 0F, 0F, 0.5235988F);
      PixelmonModelRenderer Shoulder_Pad_Back_Right = new PixelmonModelRenderer(this, 22, 30);
      Shoulder_Pad_Back_Right.addBox(0F, 0F, 0F, 4, 3, 1);
      Shoulder_Pad_Back_Right.setRotationPoint(-8.3F, -5.9F, 1F);
      Shoulder_Pad_Back_Right.setTextureSize(128, 64);
      Shoulder_Pad_Back_Right.mirror = true;
      setRotation(Shoulder_Pad_Back_Right, 0F, 0F, 0.5235988F);
      ModelBody.addChild(Body);
      ModelBody.addChild(Waist);
      ModelBody.addChild(Waist_Upper);
      ModelBody.addChild(Shoulder_Left);
      ModelBody.addChild(Shoulder_Pad_Top_Left);
      ModelBody.addChild(Shoulder_Pad_Front_Left);
      ModelBody.addChild(Shoulder_Pad_Back_Left);
      ModelBody.addChild(Shoulder_Right);
      ModelBody.addChild(Shoulder_Pad_Top_Right);
      ModelBody.addChild(Shoulder_Pad_Front_Right);
      ModelBody.addChild(Shoulder_Pad_Back_Right);
      
      PixelmonModelRenderer LeftLeg = new PixelmonModelRenderer(this, "Left Leg");
      LeftLeg.setRotationPoint(2, 6, 0.5F);
      PixelmonModelRenderer Leg_Upper_Left = new PixelmonModelRenderer(this, 0, 26);
      Leg_Upper_Left.addBox(-1F, 0F, -3F, 3, 3, 5);
      Leg_Upper_Left.setTextureSize(128, 64);
      Leg_Upper_Left.mirror = true;
      setRotation(Leg_Upper_Left, 0F, 0F, 0F);
      PixelmonModelRenderer  Leg_Middle_Left = new PixelmonModelRenderer(this, 0, 18);
      Leg_Middle_Left.addBox(-1F, 0F, -1F, 2, 6, 2);
      Leg_Middle_Left.setRotationPoint(0.5F, 3F, -0.5F);
      Leg_Middle_Left.setTextureSize(128, 64);
      Leg_Middle_Left.mirror = true;
      setRotation(Leg_Middle_Left, 0F, -0.2617994F, 0F);
      PixelmonModelRenderer  Leg_Lower_Left = new PixelmonModelRenderer(this, 8, 18);
      Leg_Lower_Left.addBox(-1F, 0F, -1F, 2, 6, 2);
      Leg_Lower_Left.setRotationPoint(0.5F, 9F, -0.5F);
      Leg_Lower_Left.setTextureSize(128, 64);
      Leg_Lower_Left.mirror = true;
      setRotation(Leg_Lower_Left, 0F, -0.2617994F, 0F);
      PixelmonModelRenderer  Feet_Upper_Left = new PixelmonModelRenderer(this, 22, 22);
      Feet_Upper_Left.addBox(-1F, 0F, -1F, 3, 1, 3);
      Feet_Upper_Left.setRotationPoint(0.2F, 15F, -0.5F);
      Feet_Upper_Left.setTextureSize(128, 64);
      Feet_Upper_Left.mirror = true;
      setRotation(Feet_Upper_Left, 0F, -0.2617994F, 0F);
      PixelmonModelRenderer  Feet_Lower_Left = new PixelmonModelRenderer(this, 66, 0);
      Feet_Lower_Left.addBox(-1F, 0F, -1F, 3, 2, 7);
      Feet_Lower_Left.setRotationPoint(1.1F, 16F, -4.5F);
      Feet_Lower_Left.setTextureSize(128, 64);
      Feet_Lower_Left.mirror = true;
      setRotation(Feet_Lower_Left, 0F, -0.2617994F, 0F);
      LeftLeg.addChild(Leg_Upper_Left);
      LeftLeg.addChild(Leg_Middle_Left);
      LeftLeg.addChild(Leg_Lower_Left);
      LeftLeg.addChild(Feet_Upper_Left);
      LeftLeg.addChild(Feet_Lower_Left);
      ModelBody.addChild(LeftLeg);
      
      PixelmonModelRenderer RightLeg = new PixelmonModelRenderer(this, "Right Leg");
      RightLeg.setRotationPoint(-2, 6, -0.5F);
      PixelmonModelRenderer Leg_Upper_Right = new PixelmonModelRenderer(this, 0, 26);
      Leg_Upper_Right.addBox(-2F, 0F, -2F, 3, 3, 5);
      Leg_Upper_Right.setTextureSize(128, 64);
      Leg_Upper_Right.mirror = true;
      setRotation(Leg_Upper_Right, 0F, 0F, 0F);
      PixelmonModelRenderer Leg_Middle_Right = new PixelmonModelRenderer(this, 0, 18);
      Leg_Middle_Right.addBox(-1F, 0F, -1F, 2, 6, 2);
      Leg_Middle_Right.setRotationPoint(-0.5F, 3F, 0.4F);
      Leg_Middle_Right.setTextureSize(128, 64);
      Leg_Middle_Right.mirror = true;
      setRotation(Leg_Middle_Right, 0F, 0.2617994F, 0F);
      PixelmonModelRenderer Leg_Lower_Right = new PixelmonModelRenderer(this, 8, 18);
      Leg_Lower_Right.addBox(-1F, 0F, -1F, 2, 6, 2);
      Leg_Lower_Right.setRotationPoint(-0.5F, 9F, 0.4F);
      Leg_Lower_Right.setTextureSize(128, 64);
      Leg_Lower_Right.mirror = true;
      setRotation(Leg_Lower_Right, 0F, 0.2617994F, 0F);
      PixelmonModelRenderer Feet_Upper_Right = new PixelmonModelRenderer(this, 22, 22);
      Feet_Upper_Right.addBox(-1F, 0F, -1F, 3, 1, 3);
      Feet_Upper_Right.setRotationPoint(-1.2F, 15F, -0.1F);
      Feet_Upper_Right.setTextureSize(128, 64);
      Feet_Upper_Right.mirror = true;
      setRotation(Feet_Upper_Right, 0F, 0.2617994F, 0F);
      PixelmonModelRenderer Feet_Lower_Right = new PixelmonModelRenderer(this, 66, 0);
      Feet_Lower_Right.addBox(-1F, 0F, -1F, 3, 2, 7);
      Feet_Lower_Right.setRotationPoint(-2.1F, 16F, -3.6F);
      Feet_Lower_Right.setTextureSize(128, 64);
      Feet_Lower_Right.mirror = true;
      setRotation(Feet_Lower_Right, 0F, 0.2617994F, 0F);
      RightLeg.addChild(Leg_Upper_Right);
      RightLeg.addChild(Leg_Middle_Right);
      RightLeg.addChild(Leg_Lower_Right);
      RightLeg.addChild(Feet_Upper_Right);
      RightLeg.addChild(Feet_Lower_Right);
      ModelBody.addChild(RightLeg);
      
      PixelmonModelRenderer LeftArm = new PixelmonModelRenderer(this, "Left Arm");
      LeftArm.setRotationPoint(6,-2,0);
      PixelmonModelRenderer Arm_Top_Left = new PixelmonModelRenderer(this, 0, 41);
      Arm_Top_Left.addBox(-1F, 0F, -1F, 2, 6, 2);
      Arm_Top_Left.setTextureSize(128, 64);
      Arm_Top_Left.mirror = true;
      setRotation(Arm_Top_Left, 0F, 0F, -0.5235988F);
      PixelmonModelRenderer Elbow_Left = new PixelmonModelRenderer(this, 0, 58);
      Elbow_Left.addBox(0F, 0F, 0F, 3, 3, 3);
      Elbow_Left.setRotationPoint(1F, 3F, -0.5F);
      Elbow_Left.setTextureSize(128, 64);
      Elbow_Left.mirror = true;
      setRotation(Elbow_Left, -0.5235988F, 0F, 0F);
      PixelmonModelRenderer Arm_Middle_Left = new PixelmonModelRenderer(this, 0, 34);
      Arm_Middle_Left.addBox(0F, 0F, 0F, 2, 5, 2);
      Arm_Middle_Left.setRotationPoint(1.5F, 4.5F, -1F);
      Arm_Middle_Left.setTextureSize(128, 64);
      Arm_Middle_Left.mirror = true;
      setRotation(Arm_Middle_Left, -0.5235988F, 0F, 0F);
      PixelmonModelRenderer Palm_Left = new PixelmonModelRenderer(this, 8, 34);
      Palm_Left.addBox(0F, 0F, 0F, 3, 4, 4);
      Palm_Left.setRotationPoint(1F, 8F, -4F);
      Palm_Left.setTextureSize(128, 64);
      Palm_Left.mirror = true;
      setRotation(Palm_Left, -0.5235988F, 0F, 0F);
      PixelmonModelRenderer Finger_Left = new PixelmonModelRenderer(this, 12, 15);
      Finger_Left.addBox(0F, 0F, 0F, 1, 2, 1);
      Finger_Left.setRotationPoint(0F, 8F, -4F);
      Finger_Left.setTextureSize(128, 64);
      Finger_Left.mirror = true;
      setRotation(Finger_Left, -0.5235988F, 0F, 0F);
      LeftArm.addChild(Arm_Top_Left);
      LeftArm.addChild(Elbow_Left);
      LeftArm.addChild(Arm_Middle_Left);
      LeftArm.addChild(Palm_Left);
      LeftArm.addChild(Finger_Left);
      ModelBody.addChild(LeftArm);
      
      
      PixelmonModelRenderer RightArm = new PixelmonModelRenderer(this, "Right Arm");
      RightArm.setRotationPoint(-5.8F,-2,0);
      PixelmonModelRenderer Arm_Top_Right = new PixelmonModelRenderer(this, 0, 41);
      Arm_Top_Right.addBox(-1F, 0F, -1F, 2, 6, 2);
      Arm_Top_Right.setTextureSize(128, 64);
      Arm_Top_Right.mirror = true;
      setRotation(Arm_Top_Right, 0F, 0F, 0.5235988F);
      PixelmonModelRenderer Arm_Middle_Right = new PixelmonModelRenderer(this, 0, 34);
      Arm_Middle_Right.addBox(0F, 0F, 0F, 2, 5, 2);
      Arm_Middle_Right.setRotationPoint(-3.7F, 4.5F, -1F);
      Arm_Middle_Right.setTextureSize(128, 64);
      Arm_Middle_Right.mirror = true;
      setRotation(Arm_Middle_Right, -0.5235988F, 0F, 0F);
      PixelmonModelRenderer Palm_Right = new PixelmonModelRenderer(this, 22, 34);
      Palm_Right.addBox(0F, 0F, 0F, 3, 4, 4);
      Palm_Right.setRotationPoint(-4.2F, 8F, -4F);
      Palm_Right.setTextureSize(128, 64);
      Palm_Right.mirror = true;
      setRotation(Palm_Right, -0.5235988F, 0F, 0F);
      PixelmonModelRenderer Finger_Right = new PixelmonModelRenderer(this, 12, 15);
      Finger_Right.addBox(0F, 0F, 0F, 1, 2, 1);
      Finger_Right.setRotationPoint(-1.2F, 8F, -4F);
      Finger_Right.setTextureSize(128, 64);
      Finger_Right.mirror = true;
      setRotation(Finger_Right, -0.5235988F, 0F, 0F);
      PixelmonModelRenderer Elbow_Right = new PixelmonModelRenderer(this, 0, 58);
      Elbow_Right.addBox(0F, 0F, 0F, 3, 3, 3);
      Elbow_Right.setRotationPoint(-4.2F, 3F, -0.5F);
      Elbow_Right.setTextureSize(128, 64);
      Elbow_Right.mirror = true;
      setRotation(Elbow_Right, -0.5235988F, 0F, 0F);
      RightArm.addChild(Arm_Top_Right);
      RightArm.addChild(Arm_Middle_Right);
      RightArm.addChild(Palm_Right);
      RightArm.addChild(Finger_Right);
      RightArm.addChild(Elbow_Right);
      ModelBody.addChild(RightArm);
      
      
      PixelmonModelRenderer ModelHead = new PixelmonModelRenderer(this, "Head");
      ModelHead.setRotationPoint(0, -4, 0);
      PixelmonModelRenderer Head = new PixelmonModelRenderer(this, 42, 0);
      Head.addBox(0F, 0F, 0F, 6, 6, 6);
      Head.setRotationPoint(-3F, -6F, -3F);
      Head.setTextureSize(128, 64);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      PixelmonModelRenderer  Neck = new PixelmonModelRenderer(this, 40, 12);
      Neck.addBox(-1.5F, 0F, -1.5F, 3, 1, 3);
      Neck.setTextureSize(128, 64);
      Neck.mirror = true;
      setRotation(Neck, 0F, 0F, 0F);
      PixelmonModelRenderer Chin = new PixelmonModelRenderer(this, 40, 16);
      Chin.addBox(0F, 0F, 0F, 3, 1, 1);
      Chin.setRotationPoint(-1.5F, 0F, -3F);
      Chin.setTextureSize(128, 64);
      Chin.mirror = true;
      setRotation(Chin, 0F, 0F, 0F);
      PixelmonModelRenderer Head_Spike_Middle = new PixelmonModelRenderer(this, 52, 12);
      Head_Spike_Middle.addBox(-1F, -4F, 0F, 2, 4, 1);
      Head_Spike_Middle.setRotationPoint(0F, -6F, -3F);
      Head_Spike_Middle.setTextureSize(128, 64);
      Head_Spike_Middle.mirror = true;
      setRotation(Head_Spike_Middle, -0.2617994F, 0F, 0F);
      PixelmonModelRenderer Head_Spike_Left_1 = new PixelmonModelRenderer(this, 16, 8);
      Head_Spike_Left_1.addBox(-1F, -3F, 0F, 2, 3, 1);
      Head_Spike_Left_1.setRotationPoint(2F, -5.7F, -2.8F);
      Head_Spike_Left_1.setTextureSize(128, 64);
      Head_Spike_Left_1.mirror = true;
      setRotation(Head_Spike_Left_1, -0.1308997F, -0.1308997F, 0.2617994F);
      PixelmonModelRenderer Head_Spike_Left_2 = new PixelmonModelRenderer(this, 16, 18);
      Head_Spike_Left_2.addBox(-0.5F, -3F, 0F, 1, 3, 1);
      Head_Spike_Left_2.setRotationPoint(2.8F, -5.3F, -2.5F);
      Head_Spike_Left_2.setTextureSize(128, 64);
      Head_Spike_Left_2.mirror = true;
      setRotation(Head_Spike_Left_2, 0F, -0.2617994F, 0.5235988F);
      PixelmonModelRenderer Head_Spike_Right_1 = new PixelmonModelRenderer(this, 16, 12);
      Head_Spike_Right_1.addBox(-1F, -3F, 0F, 2, 3, 1);
      Head_Spike_Right_1.setRotationPoint(-2F, -5.7F, -2.8F);
      Head_Spike_Right_1.setTextureSize(128, 64);
      Head_Spike_Right_1.mirror = true;
      setRotation(Head_Spike_Right_1, -0.1308997F, 0.1308997F, -0.2617994F);
      PixelmonModelRenderer Head_Spike_Right_2 = new PixelmonModelRenderer(this, 16, 22);
      Head_Spike_Right_2.addBox(-0.5F, -3F, 0F, 1, 3, 1);
      Head_Spike_Right_2.setRotationPoint(-2.8F, -5.3F, -2.5F);
      Head_Spike_Right_2.setTextureSize(128, 64);
      Head_Spike_Right_2.mirror = true;
      setRotation(Head_Spike_Right_2, 0F, 0.2617994F, -0.5235988F);
      ModelHead.addChild(Head);
      ModelHead.addChild(Neck);
      ModelHead.addChild(Chin);
      ModelHead.addChild(Head_Spike_Middle);
      ModelHead.addChild(Head_Spike_Left_1);
      ModelHead.addChild(Head_Spike_Left_2);
      ModelHead.addChild(Head_Spike_Right_1);
      ModelHead.addChild(Head_Spike_Right_2);
      ModelBody.addChild(ModelHead);
      
      
      PixelmonModelRenderer Skirt_Front = new PixelmonModelRenderer(this, 0, 12);
      Skirt_Front.addBox(0F, 0F, 0F, 2, 5, 1);
      Skirt_Front.setRotationPoint(-1F, 6F, -3F);
      Skirt_Front.setTextureSize(128, 64);
      Skirt_Front.mirror = true;
      setRotation(Skirt_Front, -0.2617994F, 0F, 0F);
      PixelmonModelRenderer Skirt_Back = new PixelmonModelRenderer(this, 6, 12);
      Skirt_Back.addBox(0F, 0F, 0F, 2, 5, 1);
      Skirt_Back.setRotationPoint(-1F, 6F, 2F);
      Skirt_Back.setTextureSize(128, 64);
      Skirt_Back.mirror = true;
      setRotation(Skirt_Back, 0.2617994F, 0F, 0F);
      PixelmonModelRenderer Skirt_Left = new PixelmonModelRenderer(this, 8, 42);
      Skirt_Left.addBox(0F, 0F, 0F, 1, 5, 2);
      Skirt_Left.setRotationPoint(3.5F, 6F, -2F);
      Skirt_Left.setTextureSize(128, 64);
      Skirt_Left.mirror = true;
      setRotation(Skirt_Left, 0F, 0F, -0.2617994F);
      PixelmonModelRenderer Skirt_Right = new PixelmonModelRenderer(this, 8, 42);
      Skirt_Right.addBox(0F, 0F, 0F, 1, 5, 2);
      Skirt_Right.setRotationPoint(-4.5F, 6F, -2F);
      Skirt_Right.setTextureSize(128, 64);
      Skirt_Right.mirror = true;
      setRotation(Skirt_Right, 0F, 0F, 0.2617994F);
      PixelmonModelRenderer Skirt_Front_Right = new PixelmonModelRenderer(this, 0, 12);
      Skirt_Front_Right.addBox(0F, 0F, 0F, 2, 5, 1);
      Skirt_Front_Right.setRotationPoint(-3.5F, 6F, -3F);
      Skirt_Front_Right.setTextureSize(128, 64);
      Skirt_Front_Right.mirror = true;
      setRotation(Skirt_Front_Right, -0.2617994F, 0F, 0F);
      PixelmonModelRenderer Skirt_Front_Left = new PixelmonModelRenderer(this, 0, 12);
      Skirt_Front_Left.addBox(0F, 0F, 0F, 2, 5, 1);
      Skirt_Front_Left.setRotationPoint(1.5F, 6F, -3F);
      Skirt_Front_Left.setTextureSize(128, 64);
      Skirt_Front_Left.mirror = true;
      setRotation(Skirt_Front_Left, -0.2617994F, 0F, 0F);
      PixelmonModelRenderer Skirt_Right_Back = new PixelmonModelRenderer(this, 8, 42);
      Skirt_Right_Back.addBox(0F, 0F, 0F, 1, 5, 2);
      Skirt_Right_Back.setRotationPoint(-4.5F, 6F, 0.5F);
      Skirt_Right_Back.setTextureSize(128, 64);
      Skirt_Right_Back.mirror = true;
      setRotation(Skirt_Right_Back, 0F, 0F, 0.2617994F);
      PixelmonModelRenderer Skirt_Left_Back = new PixelmonModelRenderer(this, 8, 42);
      Skirt_Left_Back.addBox(0F, 0F, 0F, 1, 5, 2);
      Skirt_Left_Back.setRotationPoint(3.5F, 6F, 0.5F);
      Skirt_Left_Back.setTextureSize(128, 64);
      Skirt_Left_Back.mirror = true;
      setRotation(Skirt_Left_Back, 0F, 0F, -0.2617994F);
      PixelmonModelRenderer Skirt_Back_Right = new PixelmonModelRenderer(this, 6, 12);
      Skirt_Back_Right.addBox(0F, 0F, 0F, 2, 5, 1);
      Skirt_Back_Right.setRotationPoint(-3.5F, 6F, 2F);
      Skirt_Back_Right.setTextureSize(128, 64);
      Skirt_Back_Right.mirror = true;
      setRotation(Skirt_Back_Right, 0.2617994F, 0F, 0F);
      PixelmonModelRenderer Skirt_Back_Left = new PixelmonModelRenderer(this, 6, 12);
      Skirt_Back_Left.addBox(0F, 0F, 0F, 2, 5, 1);
      Skirt_Back_Left.setRotationPoint(1.5F, 6F, 2F);
      Skirt_Back_Left.setTextureSize(128, 64);
      Skirt_Back_Left.mirror = true;
      setRotation(Skirt_Back_Left, 0.2617994F, 0F, 0F);
      PixelmonModelRenderer Skirt_Front_Left_Corner = new PixelmonModelRenderer(this, 0, 12);
      Skirt_Front_Left_Corner.addBox(0F, 0F, 0F, 2, 5, 1);
      Skirt_Front_Left_Corner.setRotationPoint(3.3F, 6F, -3.2F);
      Skirt_Front_Left_Corner.setTextureSize(128, 64);
      Skirt_Front_Left_Corner.mirror = true;
      setRotation(Skirt_Front_Left_Corner, -0.2617994F, -0.7853982F, 0F);
      PixelmonModelRenderer Skirt_Front_Right_Corner = new PixelmonModelRenderer(this, 0, 12);
      Skirt_Front_Right_Corner.addBox(0F, 0F, 0F, 2, 5, 1);
      Skirt_Front_Right_Corner.setRotationPoint(-4.8F, 6F, -1.7F);
      Skirt_Front_Right_Corner.setTextureSize(128, 64);
      Skirt_Front_Right_Corner.mirror = true;
      setRotation(Skirt_Front_Right_Corner, -0.2617994F, 0.7853982F, 0F);
      PixelmonModelRenderer Skirt_Back_Right_Corner = new PixelmonModelRenderer(this, 6, 12);
      Skirt_Back_Right_Corner.addBox(0F, 0F, 0F, 2, 5, 1);
      Skirt_Back_Right_Corner.setRotationPoint(-4.3F, 6.1F, 1.3F);
      Skirt_Back_Right_Corner.setTextureSize(128, 64);
      Skirt_Back_Right_Corner.mirror = true;
      setRotation(Skirt_Back_Right_Corner, 0.2617994F, -0.7853982F, 0F);
      PixelmonModelRenderer Skirt_Back_Left_Corner = new PixelmonModelRenderer(this, 6, 12);
      Skirt_Back_Left_Corner.addBox(0F, 0F, 0F, 2, 5, 1);
      Skirt_Back_Left_Corner.setRotationPoint(2.8F, 6F, 2.8F);
      Skirt_Back_Left_Corner.setTextureSize(128, 64);
      Skirt_Back_Left_Corner.mirror = true;
      setRotation(Skirt_Back_Left_Corner, 0.2617994F, 0.7853982F, 0F);
      ModelBody.addChild(Skirt_Front);
      ModelBody.addChild(Skirt_Back);
      ModelBody.addChild(Skirt_Left);
      ModelBody.addChild(Skirt_Right);
      ModelBody.addChild(Skirt_Front_Right);
      ModelBody.addChild(Skirt_Front_Left);
      ModelBody.addChild(Skirt_Right_Back);
      ModelBody.addChild(Skirt_Left_Back);
      ModelBody.addChild(Skirt_Back_Right);
      ModelBody.addChild(Skirt_Back_Left);
      ModelBody.addChild(Skirt_Front_Left_Corner);
      ModelBody.addChild(Skirt_Front_Right_Corner);
      ModelBody.addChild(Skirt_Back_Right_Corner);
      ModelBody.addChild(Skirt_Back_Left_Corner);
      
      ModuleHead headModule = new ModuleHead(ModelHead);

		ModuleArm leftArmModule = new ModuleArm(LeftArm, null, 0, 0);
		ModuleArm rightArmModule = new ModuleArm(RightArm, null, 0, 0);

		float legspeed = 0.65F;
		float legRotationLimit = 1.4F;

		ModuleLeg leftLegModule = new ModuleLeg(LeftLeg, EnumLeg.FrontLeft,
				EnumPhase.InPhase, legRotationLimit, legspeed);
		ModuleLeg rightLegModule = new ModuleLeg(RightLeg, EnumLeg.FrontRight,
				EnumPhase.InPhase, legRotationLimit, legspeed);

		skeleton = new SkeletonBiped(ModelBody, headModule, leftArmModule,
				rightArmModule, leftLegModule, rightLegModule, null);
      
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    ModelBody.render(f5);
  }
  
  private void setRotation(PixelmonModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  

}
