def call(String filename) {
    def text = readFile file: filename
    text = text.replaceAll("%BUILD_NUMBER%", "${BUILD_NUMBER}")
    writeFile(file: "index.html", text: text)
}
