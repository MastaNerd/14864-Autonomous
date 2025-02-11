package config.util;

import com.acmerobotics.dashboard.config.Config;

import com.pedropathing.localization.Pose;

@Config
public class FieldConstants {

    public enum RobotStart {
        BLUE_BUCKET,
        BLUE_OBSERVATION,
        RED_BUCKET,
        RED_OBSERVATION
    }

    public static final Pose blueBucketStartPose = new Pose(7.5, 78.75, Math.toRadians(180));
    public static final Pose blueObservationStartPose = new Pose(7, 63, Math.toRadians(270));
    public static final Pose redBucketStartPose = new Pose(144-blueBucketStartPose.getX(), blueBucketStartPose.getY(), 0);
    public static final Pose redObservationStartPose = new Pose(144-blueObservationStartPose.getX(), blueObservationStartPose.getY(), 0);

    // Preload Poses
    public static final Pose blueBucketPreloadPose = new Pose(29.25, 78.375, Math.toRadians(180));
    public static final Pose blueObservationPreloadPose = new Pose(38, 63, Math.toRadians(270));
    public static final Pose redBucketPreloadPose = new Pose(144-blueBucketPreloadPose.getX(), blueBucketPreloadPose.getY(), 0);
    public static final Pose redObservationPreloadPose = new Pose(144-blueObservationPreloadPose.getX(), blueObservationPreloadPose.getY(), 0);


    // Blue Bucket Sample Poses
    public static final Pose blueBucketLeftSamplePose = new Pose(22, 110, 0);
    public static final Pose blueBucketLeftSampleControlPose = new Pose(20, 96);
    public static final Pose blueBucketMidSamplePose = new Pose(22, 116, 0);
    public static final Pose blueBucketMidSampleControlPose = new Pose(20, 86);
    public static final Pose blueBucketRightSamplePose = new Pose(22, 122, 0);
    public static final Pose blueBucketRightSampleControlPose = new Pose(20, 96);
    public static final Pose blueBucketScorePose = new Pose(20, 128, Math.toRadians(-45));

    // Blue Observation Specimen Poses
    public static final Pose blueObservationPickupLeftPose = new Pose(26.5, 40.5, Math.toRadians(315));
    public static final Pose blueObservationPickupLeftPoseForward = new Pose(29, 38, Math.toRadians(315));
    public static final Pose blueObservationDropoffLeftPose = new Pose(18, 35, Math.toRadians(225));
    public static final Pose blueObservationPickupMidPose = new Pose(26.5, 30.5, Math.toRadians(315));
    public static final Pose blueObservationPickupMidPoseForward = new Pose(29, 28, Math.toRadians(315));
    public static final Pose blueObservationDropoffMidPose = new Pose(18, 25, Math.toRadians(225));
    public static final Pose blueObservationPickupRightPose = new Pose(26.5, 20.5, Math.toRadians(315));
    public static final Pose blueObservationPickupRightPoseForward = new Pose(29, 18, Math.toRadians(315));
    public static final Pose blueObservationSpecPickupPose = new Pose(9.5, 36.25, Math.toRadians(90));

    public static final Pose blueBucketParkPose = new Pose(62, 97.75, Math.toRadians(90));
    public static final Pose blueBucketParkControlPose = new Pose(60.25, 123.5);
    public static final Pose blueObservationParkPose = new Pose(10, 20, Math.toRadians(270));


}