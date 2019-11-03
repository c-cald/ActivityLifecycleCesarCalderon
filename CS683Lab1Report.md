# CS683 Lab1 Report 
### Cesar Calderon

## Set up Android Studio and Git/Github

Briefly describe your experience with Android studio/AVD and Git/Github for this lab, 
particularly if you encountered any difficulties and issues. 

ANSWER:

Android Studio is very user friendly, I cloned the repo from the Github link provided by the professor directly from the initial menu. It is great since it creates the folder structure just as it is on github.  After creating a github account, just clicking on the link the professor had created allowed me to get access to the lab 1 files. After setting up Android Studio - Creating the project from github link was fairly straight forward - just copying and pasting the link onto the create project window and get from github.

I had an error when I first started using the AVD [ Android Virtual Device], doing a little bit of research allowed me to resolve it. As it turns out the screen default settings are not set up emulate the phone screens. I had to go the BIOS settings of my computer and enable the intel setting. restarting my computer and android studio, then trying it again and it worked.

the remaining issues were mostly due to syntax, I kept writing TAG in the log method but after researching, realized that the TAG word was not suppose to be written but showed up in the background. 

Once I got the code error free, I connected the dots and realized that running the app in the phone emulator was the way to active the methods I had written, using Logcat once the app started.. I could see the tag main activity in the Logcat. This is a little bit different, since from my previous programming classes, I am use to running the program then either seeing a gui window or command prompt output. The rest of the lab was fairly straight forward.

## Activity Lifecycle Summary

Fill the following table with your findings.

| Actions | Callback functions called in order |
|---|---|
| Activity launched | onCreate() |
| | onStart() |
| | onResume() |
| Activity running | onPause() |
|  | onStop() |
|  |  |
| Activity shut down | onDestroy() |

The right sequence of events is also shown below:

![Activity-Lifecycle concepts](C:\Users\Cesar Calderon\Desktop\BU - METCS Files\METCS683\Lab Files\Activity-Lifecycle concepts.PNG)



## Screenshots

callback methods: onCreate(), onStart(), onResume()

![Lab 1 Callback Methods](C:\Users\Cesar Calderon\Desktop\BU - METCS Files\METCS683\Lab Files\Lab 1 Callback Methods.PNG)

call methods, onPause(), onStop()

![Lab 1 Callback Methods - onPause - onStop](C:\Users\Cesar Calderon\Desktop\BU - METCS Files\METCS683\Lab Files\Lab 1 Callback Methods - onPause - onStop.PNG)

onDestroy method is called.

![Lab 1 Callback Methods - onDestroy](C:\Users\Cesar Calderon\Desktop\BU - METCS Files\METCS683\Lab Files\Lab 1 Callback Methods - onDestroy.PNG)

References: 

these links were very insightful in completing the lab.

Callback methods explained with app and button. https://www.youtube.com/watch?v=UJN3AL4tiqw

https://www.youtube.com/watch?v=ldaT23PSe0s

More information on Lifecycle activity app demo:

https://books.google.com/books?id=nGzWDQAAQBAJ&pg=PA130&lpg=PA130&dq=how+to+get+log.i+to+show+onpause()+?&source=bl&ots=S7yC-2DCm8&sig=ACfU3U2NW0dvLFEkThDROYm4T6VGilXllw&hl=en&sa=X&ved=2ahUKEwiroNi7oM7lAhVCpZ4KHcXcCtgQ6AEwBXoECAkQAg#v=onepage&q=how%20to%20get%20log.i%20to%20show%20onpause()%20%3F&f=false

http://www.informit.com/articles/article.aspx?p=2432029

Android Developer - lifecycle 

https://developer.android.com/guide/components/activities/activity-lifecycle.html



