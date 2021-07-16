# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_galactic
inherit ros_superflore_generated

DESCRIPTION = "An rqt-based tool that assists monitoring tasks    for <a href="http://ros.org/wiki/moveit">MoveIt!</a> motion planner    developers and users. Currently the following items are monitored if they    are either running, existing or published:    <ul>    <li>Node: /move_group</li>    <li>Parameter: [/robot_description, /robot_description_semantic]</li>    <li>Topic: Following types are monitored. Published &quot;names&quot; are ignored.<br/>        [sensor_msgs/PointCloud, sensor_msgs/PointCloud2,         sensor_msgs/Image, sensor_msgs/CameraInfo]</li>    </ul>    Since this package is not made by the MoveIt! development team (although with    assistance from the them), please post issue reports to the designated    tracker (not MoveIt!'s main tracker)."
AUTHOR = "Isaac I.Y. Saito <iisaito@kinugarage.com>"
ROS_AUTHOR = "Isaac Saito"
HOMEPAGE = "http://wiki.ros.org/rqt_moveit"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=29;endline=29;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_moveit"
ROS_BPN = "rqt_moveit"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    python3-setuptools-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-qt-binding \
    rclpy \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
    rqt-topic \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rqt_moveit-release/archive/release/galactic/rqt_moveit/1.0.1-2.tar.gz
ROS_BRANCH ?= "branch=release/galactic/rqt_moveit"
SRC_URI = "git://github.com/ros2-gbp/rqt_moveit-release;${ROS_BRANCH};protocol=https"
SRCREV = "f7942af3d298d64d934e72fe4ca8a461e3e6f250"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
