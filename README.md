# android-fragment
Fragment LifeCycle

onAttach - onCreate - onCreateView - onActivityCreated - onStart - onResume - onPause -  onStop - onDestroyView - onDestroy
-onDetach

onAttach  : Fragment has been attached to activity.

onCreate  : One time initialize code can be put here.

onCreateView: Fragment draw its UI

onACtivityCreate : it let fragment know. Activity onCreate is completed. Anything that need to do after after 
                  activity onCreate need to be done here.
                  
onStart : App perpare to get visible

onResume : App is visible and  user start interacting.

onPause : App move in background.
 
onStop : any functionality that is not required if app is invisible can be deallocated here.

onDestroyView : Any clean up related to view can be done here.

OnDestroy . : Final clean of fragment state 

OnDetach : fragment is detach from hosting activity.


SavedInstance on Screen Orientaion
onPause - onSavedInstance 
onCreateView(saveInstance) will restore value

SetRetainInstance(true) onActivityCreated will keep Fragment object alive on screen orientation

Interfragment Communication
