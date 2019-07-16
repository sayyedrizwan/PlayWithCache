# PlayWithCaches

A chache and App data cleaner .

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


 <h6> To Clean your app cache </h6>	
 	
	PlayCache.cleanCache(context);


 <h6> To Clean your app cache and display Toast message </h6>	
 	
	PlayCache.cleanCachewithMessage(context, "Cleared cache"); //if message empty if want to get defualt message
       

 <h6> To Clean your app data </h6>	
 	
	PlayCache.clearAppData(context);
	

 <h6> To Clean your app data and display Toast message </h6>	
 	
	PlayCache.clearAppDatawithToast(context, "Data delete successfully"); //if message empty if want to get defualt message
       
