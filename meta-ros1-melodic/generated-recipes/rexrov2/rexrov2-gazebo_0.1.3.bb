# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Package with launch files for demonstrations with the RexROV 2 vehicle"
AUTHOR = "Musa Morena Marcusso Manhaes <Musa.Marcusso@de.bosch.com>"
ROS_AUTHOR = "Musa Morena Marcusso Manhaes <Musa.Marcusso@de.bosch.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "rexrov2"
ROS_BPN = "rexrov2_gazebo"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rexrov2-control \
    rexrov2-description \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uuvsimulator/rexrov2-release/archive/release/melodic/rexrov2_gazebo/0.1.3-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rexrov2_gazebo"
SRC_URI = "git://github.com/uuvsimulator/rexrov2-release;${ROS_BRANCH};protocol=https"
SRCREV = "e59b8a07e365d9ef514c8f582032df6c55981de0"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
