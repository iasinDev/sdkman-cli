package sdkman.utils


class TestUtils {

    static final DEFAULT_BASE_DIR = "/tmp/sdkman-test"

    static File prepareBaseDir() {
        def counter = "${(Math.random() * 10000).toInteger()}".padLeft(4, "0")
        def baseDir = "$DEFAULT_BASE_DIR/sdkman-$counter" as File
        baseDir.mkdirs()
        baseDir
    }
}
