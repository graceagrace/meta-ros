# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "APIs for storing and querying information about the world.     Provides C++ and Python API's to make getting facts in and out easy (while still exposing a full SQL interface).         Supports PostgreSQL and MySQL backends."
AUTHOR = "Nick Walker <nswalker@cs.washington.edu>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "knowledge_representation"
ROS_BPN = "knowledge_representation"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libpqxx-dev} \
    ${ROS_UNRESOLVED_DEP-libpqxx} \
    boost \
    postgresql \
    python3 \
    roslint \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    python3-setuptools-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libpqxx-dev} \
    ${ROS_UNRESOLVED_DEP-libpqxx} \
    boost \
    postgresql \
    python3 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libpqxx-dev} \
    ${ROS_UNRESOLVED_DEP-libpqxx} \
    boost \
    postgresql \
    python3 \
    python3-pillow \
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

# matches with: https://github.com/utexas-bwi-gbp/knowledge_representation-release/archive/release/noetic/knowledge_representation/0.9.3-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/knowledge_representation"
SRC_URI = "git://github.com/utexas-bwi-gbp/knowledge_representation-release;${ROS_BRANCH};protocol=https"
SRCREV = "83976dc5084c0d9045117aeb549b7f50558f3ea7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
