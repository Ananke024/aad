LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := hello-jni
LOCAL_SRC_FILES := hello-jni.c

#TARGET_ARCH_ABI := x86
APP_ABI := armeabi armeabi-v7a x86

include $(BUILD_SHARED_LIBRARY)
