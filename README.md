# android-fragment
Fragment LifeCycle

onAttach - onCreate - onCreateView - onActivityCreated - onStart - onResume - onPause -  onStop - onDestroyView - onDestroy
-onDetach


SavedInstance on Screen Orientaion
onPause - onSavedInstance 
onCreateView(saveInstance) will restore value

SetRetainInstance(true) onActivityCreated will keep Fragment object alive on screen orientation

Interfragment Communication
