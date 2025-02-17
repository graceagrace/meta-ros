# Copyright (c) 2024 Wind River Systems, Inc.

<<<<<<< HEAD
inherit pkgconfig

ROS_BUILD_DEPENDS += " \
    gz-transport14 \
=======
export GZ_RELAX_VERSION_MATCH="1"

inherit pkgconfig

ROS_BUILD_DEPENDS += " \
    gz-transport13 \
>>>>>>> feature/preserve-original-scarthgap-humble-viz-tool-fixes
    protobuf \
"

ROS_BUILDTOOL_DEPENDS += " \
    protobuf-native \
    cppcheck-native \
"

EXTRA_OECMAKE += " \
    -DPROTOBUF_PROTOC_EXECUTABLE=${STAGING_BINDIR_NATIVE}/protoc \
"
