# ipCheckerApp  
A simple ip check  app in Kotlin, Android using retrofit, in different branches coroutines and rxjava.


<table>
  <tr>
    <td>Splash Screen Page</td>
     <td>Photo List Page</td>
  </tr>
  <tr>
    <td><img src="/app/previews/preview1.png" ></td>
    <td><img src="/app/previews/preview2.png" ></td>
  </tr>
 </table>
 
## Tech Stack & Open-source Libraries
- Minimum SDK level 21
- [Kotlin](https://kotlinlang.org/), [Android appcompat](https://developer.android.com/jetpack/androidx/releases/appcompat)
- [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) for asynchronous operations and Network call .
- [Lifecycle](https://developer.android.com/jetpack/androidx/releases/lifecycle) for observe Android lifecycles and handle UI states upon the lifecycle changes.
- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) for manage UI-related data holder and lifecycle aware. Allows data to survive configuration changes such as screen rotations.
- [DataBinding](https://developer.android.com/topic/libraries/data-binding) for bind UI components in your layouts to data sources in your app using a declarative format rather than programmatically.
- [Android View Binding](https://developer.android.com/topic/libraries/view-binding)
- [Retrofit2](https://github.com/square/retrofit) - for REST API communication.

## Architecture
ipCheckerApp is based on the clean architecture with MVVM(Model - View - View Model) design pattern.
