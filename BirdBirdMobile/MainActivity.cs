using System; 
using Android.App; 
using Android.Content; 
using Android.Runtime; 
using Android.Views; 
using Android.Widget; 
using Android.OS;  

namespace HelloXamarin {     
   [Activity(Label = "HelloXamarin", MainLauncher = true, Icon = "@drawable/icon")] 
   public class MainActivity : Activity { 
      protected override void OnCreate(Bundle bundle) { 
         base.OnCreate(bundle); 
         SetContentView(Resource.Layout.Main); 
         Button button = FindViewById<Button>(Resource.Id.MyButton); 
         button.Click += delegate { button.Text = "Hello world I am your first App"; }; 
      } 
   } 
} 