# LiteAdapter

The lite adapter is a new RecyclerView coding style, which dose not provide complex function.
Its goal is to reduce the work of the adapter, let each view take their own data binding work.

# Usage

1. Add `mavenCentral` dependence in your project root directory level build.gradle file.
```XML
buildscript {
    repositories {
        google()
        mavenCentral() // add this line
    }
}

allprojects {
    repositories {
        google()
        mavenCentral() // add this line
    }
}

task clean(type: Delete) {
    delete rootProject.buildDir
}
```
2. Add `LiteAdapter` dependence in your module directory level build.gradle file.
```XML
dependencies {
    ...
    implementation 'io.github.chengjie-jlu:liteadapter:1.0.0' // add this line
}

```
3. Sync your project.
