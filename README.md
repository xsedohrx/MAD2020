# MAD2020  
  
# Level 1 Questions  
1) What are the names of the latest three versions of Android?  
8 (Oreo)  
9 (Pie)  
10 (Q)  
10+ (R)  
  
2) What does the abbreviation ART stand for?  
Android Runtime  
  
3) What is Android Jetpack?  
A suite of libraries to help developers follow best practices, reduce boilerplate code and write code that works consistently across Android versions and devices so that developers can focus on the code they care about.  
  
4) Describe the difference between the fixed, wrap_content and match_constraint setting of the constraint layout?  
Fixed layout: This means the view will have the exact size that is given by the developer.  
Wrap_Content: force it to expand only far enough to contain the values (or child controls) it contains.  
Match_Constriant: the view will take up as much space as the Constraints allow it to take.  
  
5) What does the abbreviation DP stand for and why do we need them?  
Density-independent pixels  
  
6) What is the purpose of the string.xml file?  
This file is used to store string variables so we don't use hardcoded strings in the application.  
It also keeps the code cleaner and easier to read.  
  
7) Why is the layout in Android specified by .xml files?  Why not just have the layout in the code (Kotlin or Java)?  
Using XML makes it easier to seperate the presentation of the app from the code. It also makes it easier to make multiple layouts for different screen sizes and orientations.  
  
8) What kind of information can be found in the manifest file?  
Essential information about the app that is described to the Android build tools, the android operating system and Google Play.  
  
9) What is the purpose of view binding in Android?  
It allows the user to more easily write code that interacts with views.  
  
  
# Level 2 Questions  
1) What is the difference of a staggered grid comparing to a normal grid?  
Grid view: It is is a ViewGroup that displays items in a two-dimensional, scrollable grid. In this each Grid is of same size (Height and width). Grid View shows symmetric items in view.  
Staggered Grid:  It is basically an extension to Grid View but in this each Grid is of varying size(Height and width). Staggered Grid View shows asymmetric items in view.  
  
2) What is the purpose of logcat?  
Logcat is a command-line tool that dumps a log of system messages, including stack traces when the device throws an error and messages that you have written from your app with the Log class.  
  
3) What kind of gestures are available?  
Tap, Click, or  
Double Touch or Double Tap  
Long Click, Long Press, or Long Touch  
Drag, Swipe, or Fling  
Pinch Open and Pinch Closed  
Twirl and Tilt  
  
4) What was the predecessor of the recyclerview?  
Listview  
  
5) What is the difference between a Toast and Snackbar?  
Snackbar: Snackbars provide lightweight feedback about an operation in a small popup at the base of the screen on mobile and at the lower left on desktop. They are above all over elements on screen, including the FAB.  
  
Toast: Android also provides a capsule-shaped toast, primarily used for system messaging. Toasts are similar to snackbars but do not contain actions and cannot be swiped off screen.  
  
6) What is the purpose of the existence of “optionals” (represented by the “?” mark) in the Kotlin language? And what does the “!!” mark mean?  
Optionals: The purpose of optionals is to get rid of NullPointerExeptions.  
!!: converts any value to a non-null type and throws an exception if the value is null.  
  
7) What is the purpose of a “data class” in Kotlin?  
We frequently create classes whose main purpose is to hold data. In such a class some standard functionality and utility functions are often mechanically derivable from the data.  
  
8) What is a “companion object” in Kotlin? Explain the difference (if any) with a “static final” and with a “val”, and when to use which constant type.  
Companion object: If you need a function or a property to be tied to a class rather than to instances of it, you can declare it inside a companion object:  
val: Read-only local variables are defined using the keyword val. They can be assigned a value only once.    

9) Explain what “StaggeredGridLayout” is  
StaggeredGridLayoutManager is a part of RecyclerView.LayoutManager (see Answer to question 1 for more details).  
  
  
# Level 3 Questions  
1) Which stages of an activity lifecycle exists?  
2) Which are the two kind of intents, and what is the difference?  
3) What is the difference between Parcelables and Serializables?  
4) What is the purpose of the analyzer?  
  
# Level 4 Questions  
1) A singleton pattern is used in the class that defines the database. What is the purpose of this pattern?  
2) Why should you load the data in a background thread?  
3) What are the three major components of ROOM and what are their responsibilities?  
4) How can you extract the current database so that you can see the table, columns, and data?  