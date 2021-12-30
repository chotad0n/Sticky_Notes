# Sticky_Notes
Version 1.0 2021/12/31

This repository contains code for the Sticky_Note project.

## Overview

Sticky_Notes is an aplication which you can use to make a list or a timetable that you want to look at everytime you visit your smartphones home screen.

<img src="https://user-images.githubusercontent.com/73274912/147785070-1406e7c0-9d60-4edf-a86e-89631c036480.jpeg" width=45% height=25% alt="Main">           <img src="https://user-images.githubusercontent.com/73274912/147785068-c0b51285-7c1e-4862-a6e8-4851854df018.jpeg" width=45% height=25% alt="Widget">

# Device permissions
*App needs the following user's permissions to provide the featured functionality*
* Request user's permission to read and write to external storage
```xml
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
```
```xml
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
```
* Request user's permission to access the internet(not necessary)
```xml
<uses-permission android:name="android.permission.INTERNET"/>
```
* Specifications
```gradle
defaultConfig {
        applicationId "com.example.stickynotes"
        minSdkVersion 21
        targetSdkVersion 31
        versionCode 1
        versionName "1.0"
    }
```

```gradle
dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation 'androidx.appcompat:appcompat:1.4.0'
    implementation 'com.google.android.material:material:1.4.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.2'
    testImplementation 'junit:junit:'
    testImplementation 'org.testng:testng:6.9.6'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
    implementation 'com.github.h6ah4i:ColorPicker:develop-SNAPSHOT'

    implementation 'androidx.preference:preference:1.1.1'

    implementation 'com.google.android.material:material:1.6.0-alpha01'

    implementation 'androidx.cardview:cardview:1.0.0'
}
```
## Features
* Save note locally
* Add a widget
* Customize widget
* Change font size and color
* change background color and opacity

### Libraries/technology used:
* https://libraries.io/github/h6ah4i/ColorPicker
* android.preference
* android.material.floatingactionbutton.FloatingActionbutton

<img src="https://user-images.githubusercontent.com/73274912/147785069-afefb32d-39e0-43ab-ac83-07ede758597f.jpeg" width=45% height=25% alt="Settings">           <img src="https://user-images.githubusercontent.com/73274912/147785989-7f952fc0-91fa-4a8d-bb82-dbbfd970d96b.jpeg" width=45% height=25% alt="Settings">


