# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "This package provides implementations of the Trajectory Rollout and Dynamic Window approaches to local robot navigation on a plane. Given a plan to follow and a costmap, the controller produces velocity commands to send to a mobile base. This package supports both holonomic and non-holonomic robots, any robot footprint that can be represented as a convex polygon or circle, and exposes its configuration as ROS parameters that can be set in a launch file. This package's ROS wrapper adheres to the BaseLocalPlanner interface specified in the <a href="http://wiki.ros.org/nav_core">nav_core</a> package."
AUTHOR = "Michael Ferguson <mfergs7@gmail.com>"
ROS_AUTHOR = "Eitan Marder-Eppstein"
HOMEPAGE = "http://wiki.ros.org/base_local_planner"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "navigation"
ROS_BPN = "base_local_planner"

ROS_BUILD_DEPENDS = " \
    angles \
    cmake-modules \
    costmap-2d \
    dynamic-reconfigure \
    geometry-msgs \
    libeigen \
    message-generation \
    nav-core \
    nav-msgs \
    pluginlib \
    rosconsole \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    visualization-msgs \
    voxel-grid \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    costmap-2d \
    dynamic-reconfigure \
    geometry-msgs \
    libeigen \
    nav-core \
    nav-msgs \
    pluginlib \
    rosconsole \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-ros \
    visualization-msgs \
    voxel-grid \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    costmap-2d \
    dynamic-reconfigure \
    geometry-msgs \
    libeigen \
    message-runtime \
    nav-core \
    nav-msgs \
    pluginlib \
    rosconsole \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-ros \
    visualization-msgs \
    voxel-grid \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/navigation-release/archive/release/noetic/base_local_planner/1.17.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/base_local_planner"
SRC_URI = "git://github.com/ros-gbp/navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "edf2e0b7a0dfc5f424b42b101fc3319b2f8661ad"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
