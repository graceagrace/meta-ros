# Copyright (c) 2024 Wind River Systems, Inc.

<<<<<<< HEAD
ROS_BUILDTOOL_DEPENDS += "protobuf-native"
=======
ROS_BUILDTOOL_DEPS += "protobuf-native"
>>>>>>> feature/preserve-original-scarthgap-humble-viz-tool-fixes

EXTRA_OECMAKE += " \
    -DPROTOBUF_PROTOC_EXECUTABLE=${STAGING_BINDIR_NATIVE}/protoc \
"
