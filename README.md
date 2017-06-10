# SmartyToast
Android library with collection of some smart toasts designs which will help in situations of following:-<br>
<UL>
<LI>Completion of some work(Done!!)</LI>
<LI>Errors</LI>
<LI>Warnings(Done!!)</LI>
<LI>Connection Established(Done!!)</LI>
<LI>Saving completion(Saved!!)</LI>
<LI>Update Status(Updating...)</LI>
</UL>

[![](https://jitpack.io/v/amanjeetsingh150/SmartyToast.svg)](https://jitpack.io/#amanjeetsingh150/SmartyToast) [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Smarty%20Toast-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/5853)<br><br>
<img src="https://cloud.githubusercontent.com/assets/12881364/26762716/777f7f70-4964-11e7-870f-4f92e6fabf1e.gif"><br><br>

<b>DOWNLOAD
<p>Add this to your root <code>build.gradle</code> file</p>

<pre><code>allprojects {
        repositories {
            ...
            maven { url "https://jitpack.io" }
        }
    }
</code></pre>

<p>Add this to your app module's <code>build.gradle</code> file</p>

<pre><code>dependencies {
            compile 'com.github.amanjeetsingh150:SmartyToast:1.0'
    }
</code></pre>
<br>
<b>USAGE:</b><br>
<b>Java</b>
<pre>SmartyToast.makeText(getApplicationContext(),"Your message",SmartyToast.LENGTH_SHORT,SmartyToast.DONE);</pre>
<p>Last parameter here is the type of toast you want to show.<br>
<b>Available Parameters are:
<UL>
<LI>DONE</LI>
<LI>WARNING</LI> 
<LI>ERROR</LI>
<LI>SAVED</LI>
<LI>CONNECTED</LI>
<LI>UPDATE</LI>
</UL>
<br>
<b> License
<pre><code>Copyright 2017 Amanjeet Singh

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

</code></pre>
