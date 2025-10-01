data class PluginMetadata(
    val icon: String = "default",
    val name: String,
    val description: String = "",
    val version: String,
    val author: String = "",
    val nativePath: String = "",
    val plugin: String = "",
    val importClass: String = "",
    val framework: String = "default",
    val maxVersion: Int = 1,
    val minVersion: Int = 0,
    val protocol: Int = 1
) {
    init {
        require(name.isNotBlank()) { "Plugin name cannot be blank" }
        require(version.isNotBlank()) { "Plugin version cannot be blank" }
    }
    
  
    fun isCompatibleWith(version: Int): Boolean {
        return version in minVersion..maxVersion
    }
    
    fun isValid(): Boolean {
        return name.isNotBlank() && version.isNotBlank()
    }
}

fun PluginMetadata.toJsonString(): String {
    return """{
        "icon": "$icon",
        "name": "$name",
        "description": "$description",
        "version": "$version",
        "author": "$author",
        "native": "$nativePath",
        "plugin": "$plugin",
        "import": "$importClass",
        "framework": "$framework",
        "max_version": $maxVersion,
        "min_version": $minVersion,
        "protocol": $protocol
    }"""
}
