# PlayWithCache

A cache and App data cleaner for Android.

<h1> Download latest version via Gradle</h1>

<h3> STEP : 1 </h3>
    
    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

<h3> STEP : 2 </h3>

    dependencies {
	        implementation 'com.github.sayyedrizwan:PlayWithCache:1.2.0'
	}
  
  
<h4> How you can use PlayCache in your Android app </h4>


 <h6> Add This permission in your AndroidManifest.xml </h6>	
 	
	 <uses-permission android:name="android.permission.CLEAR_APP_CACHE"
        tools:ignore="ProtectedPermissions" />




 <h6> To Clean your app cache </h6>	
 	
	PlayCache.cleanCache(context);


 <h6> To Clean your app cache and display Toast message </h6>	
 	
	PlayCache.cleanCachewithMessage(context, "Cleared cache"); //if message empty if want to get defualt message
       


 <h6> Add This permission in your AndroidManifest.xml </h6>	
 	
	
    <uses-permission android:name="android.permission.CLEAR_APP_USER_DATA"
        tools:ignore="ProtectedPermissions" />

	
	
 <h6> To Clean your app data </h6>	
 	
	PlayCache.clearAppData(context);
	

 <h6> To Clean your app data and display Toast message </h6>	
 	
	PlayCache.clearAppDatawithToast(context, "Data delete successfully");
			//if message left empty it will give defualt message
       
       
       
License


	Copyright 2018-2019 Wallpo Inc.

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

   	http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
	
	
	
	
	
<p><font size="2"> Founder Rizwan Sayyed </font></p>
