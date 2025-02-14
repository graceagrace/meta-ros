# Copyright (c) 2024 Wind River Systems, Inc.

<<<<<<< HEAD
export GZ_RELAX_VERSION_MATCH="1"

=======
>>>>>>> master-next
# CMake Warning at gz-sim-vendor/0.1.0-1/recipe-sysroot/usr/lib/cmake/Qt5/Qt5Config.cmake:7 (message):
#   SkippingbecauseOE_QMAKE_PATH_EXTERNAL_HOST_BINSisnotdefined
inherit ${@bb.utils.contains_any('ROS_WORLD_SKIP_GROUPS', ['qt5', 'qt5-widgets'], '', 'cmake_qt5', d)}

<<<<<<< HEAD
ROS_BUILD_DEPENDS += "gz-sim8"
=======
ROS_BUILD_DEPENDS += "gz-sim9"
>>>>>>> master-next
ROS_BUILDTOOL_DEPENDS += "protobuf-native"

EXTRA_OECMAKE += " \
    -DPROTOBUF_PROTOC_EXECUTABLE=${STAGING_BINDIR_NATIVE}/protoc \
"
