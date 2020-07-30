load("@com_github_mihaibojin_bazel_java_rules//junit5:rules.bzl", "junit5_test")

junit5_test(
    name = "tests",
    srcs = glob(["java/**/*.java"]),
    resources = glob(["resources/**"]),
    test_package = "com",
    deps = [
        "//src/main:main",
    ],
)