# FastlanReminderApp

**Steps to integrate fastlane into project**

1.Follow the instructions from fastlane site

2.Setup fastlane on windows(https://www.youtube.com/watch?v=zYBYegeTNwY&t=114s)

3.Install Ruby

4.Add environment variable,
5.Run bundle exec fastlane init(That's it! fastlane will automatically generate a configuration for you based on the information provided.
You can see the newly created ./fastlane directory, with the following files:
* **Appfile** which defines configuration information that is global to your app
* **Fastfile** which defines the "lanes" that drive the behavior of fastlane
* **Gemfile and Gemfile.lock** will be created
)
5.1.Add package name in the terminal
  
6.Run bundle exec fastlane action gradle

7.Run fastlane env

8.Run bundle exec fastlane install_plugins

9.Run 1st fastlane command

10.To distribute app through firebase app distribution follow the steps:
  10.1. Add firebase to your project and json file from it
  10.2. Goto App Distribution page integrate project and add testers
  10.3.Install Firebase CLI
  10.4.In CLI- Run Firebase login 
  10.5.In command prompt firebase login, 
  10.6.In command prompt firebase login:ci -->It'll redirect to webpage to login the page
  10.7.Once you logged in you'll get a **Firebase token** and paste in **firebase_cli_token**    
desc "Prepare Android Build & Distribute to Firebase App Distribution"
  lane :beta_android do
  release_build
  firebase_app_distribution(
  app: "********************",
  firebase_cli_token: "****************",
  groups: "testers",
  release_notes:"* New Dev apk file created"
  )
  end

10.8.Open Google Cloud console to another json file("https://firebase.google.com/docs/app-distribution/android/distribute-fastlane")
10.9.Download the json file, paste inside your project and paste the file path in Appfile 

11.**Integrate Slack**
11.1.Watch this video to integrate slack into project 
11.2.Need to create webhook url first
11.3.Select slack channel to notify the message
11.4.Watch this video to create webhook url("https://www.youtube.com/watch?v=6NJuntZSJVA","https://www.youtube.com/watch?v=sxtC40gUS2A")
