# ipCheckerApp  
A simple ip check  app in Kotlin, Android using retrofit, in different branches coroutines and rxjava.

## Preview
<table>
  <tr>
    <td><img src="/app/previews/preview1.png" ></td>
    <td><img src="/app/previews/preview2.png" ></td>
  </tr>
 </table>
 
 ## Functionality
The app's functionality includes:
 Fetch ip information from (http://checkip.amazonaws.com/) and shows them in textview when user click the button.

## Tech Stack & Open-source Libraries
- Minimum SDK level 21
- [Kotlin](https://kotlinlang.org/), [Android appcompat](https://developer.android.com/jetpack/androidx/releases/appcompat)
- [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) for asynchronous operations and Network call.
- [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/) A cold asynchronous data stream that sequentially emits values and completes normally or with an exception.
- [RxJava3](https://github.com/ReactiveX/RxJava)  Newest version of famous reactive programming library for Java, and other languages
- [Lifecycle](https://developer.android.com/jetpack/androidx/releases/lifecycle) for observe Android lifecycles and handle UI states upon the lifecycle changes.
- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) for manage UI-related data holder and lifecycle aware. Allows data to survive configuration changes such as screen rotations.
- [Android View Binding](https://developer.android.com/topic/libraries/view-binding)
- [Retrofit2](https://github.com/square/retrofit)  for REST API communication.

## Architecture
ipCheckerApp is based on the clean architecture with MVVM(Model - View - View Model) design pattern.
