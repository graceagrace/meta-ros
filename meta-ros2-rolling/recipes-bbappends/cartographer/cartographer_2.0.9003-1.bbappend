# Copyright (c) 2019-2021 LG Electronics, Inc.

FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"
SRC_URI += " \
    file://0001-CMakeLists.txt-link-with-dl.patch \
    file://0001-FindLuaGoogle.cmake-explicitly-link-with-dl.patch \
    file://cmake.dont.add.Werror.uninitialized.patch \
    file://0001-Fix-build-with-gtest-1.8.1.patch \
    file://0002-CmakeLists.txt-set-C-version-to-C-14.patch \
    file://0001-FindLuaGoogle.cmake-accept-5.4-lua-as-well.patch \
    file://use-newer-abseil-api.patch \
"

inherit pkgconfig

# This is used only to generate documentation so it should
# be native and needs quite a lot of native python dependencies
ROS_BUILD_DEPENDS:remove = "${PYTHON_PN}-sphinx python-sphinx"

DEPENDS += " \
    protobuf-native \
"

# Otherwise linking with liblua.a fails with undefined references to dlsym, dlopen, dlerror, dlclose
CXXFLAGS += "-fuse-ld=gold"

# Doesn't need runtime dependency on ceres-solver
ROS_EXEC_DEPENDS:remove = "ceres-solver"
