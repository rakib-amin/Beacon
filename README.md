Beacon
1. Introduction
Problem: Traffic Jam, a major drawback to our progression through everyday activities has been
more of a frustration than a situation due to the lack of management. It’s a matter of road,
transport facilities and long term solutions, so obviously, blaming the Govt. or respective areas of
law enforcement produced no results. Therefore we have been bearing it as a crown of thorn. It is
not a problem that we can eliminate immediately, but the one we can avoid. “Prevention before
Cure”- as they say.
Solution: An alert software that tracks and reports occurrences of traffic jam. It will show specific
routes where jam are occurring real-time (based on internet/GPS services). It will provide alternate
routes to destination based on that tracking.
2. Scope
This App Does: Users of this app will be Android Phone users who travels using general routes
described in map (Dhaka). This application uses ‘Crowd Sourcing’-a popular survey-based data
collection approach, so 16+ users are more potential sources of data gathering. The system
analyzes the received data and conducts search for options to a specific problem (e.g find and
show routes etc). It will provide a User Interface as per user’s need to navigate through the app,
along with server side assistance.
This App Does NOT: It does NOT guarantee a clean, smooth experience in the route it suggested
to the user. It will NOT base its assumptions on direct contact with anyone but the users. It will
NOT cover any route not shown in Google Maps. It can NOT show any suggestions with no user
active. It will NOT work real-time in offline mode.
3. System Bodies
Users: [UNREGISTERD]
Can:
 Browse maps and watch suggestion marks on it by others
 Register.
Can NOT:
 Suggest routes.
 Edit others’ suggestions.
 Rate suggestions by others.
 Take part in polling.
 Find point to point ‘Good’ routes.
Users: [REGISTERD]
Can:
 Log in once. (except after log out)
 Create / Update (after creation) a user profile.
 Create connections with other users
 Browse connected peers’ profiles.
 Suggest routes.
 Rate suggestions by others.
 Take part in polling.
 Find point to point ‘Good’ routes.
Can NOT:
 Edit others’ suggestions.
 Rate a suggestion twice.
 Communicate with peers through the app.
[NO ADMIN USER WILL BE ALLOTTED EXCEPT IN CASE OF SYSTEM CRASH/FAILURE]
4. Use cases of the system:
Registration:
Actors Actions Comments (if Applicable)
User [Unregistered], System After information from user is
provided, creates an account
Secondary: Google TM login.
Create Profile:
Actors Actions Comments (if Applicable)
User [Registered], System After information from user is
provided, creates a profile.
Update Profile:
Actors Actions Comments (if Applicable)
User [Registered], System After prompt, updates a
profile.
Not applicable if no profile
exists.
Add suggestion:
Actors Actions Comments (if Applicable)
User [Registered], System After prompt, user will
provide binary response.
System will track his/her
position and create a
suggestion.
Future Proposal: Delayed
Response analysis using AI
Browse Map:
Actors Actions Comments (if Applicable)
User [Registered,
Unregistered], System
After prompt, System will
provide a map showing ‘red’
or ‘green’ routes.
Existence in Google Maps.
Check Route:
Actors Actions Comments (if Applicable)
User [Registered], System After prompt with specified
points (locations), System will
provide a route (if available)
with ratings.
Existence in Google Maps.
Search Suggestions:
Actors Actions Comments (if Applicable)
User [Registered], System After prompt with
specification, System will
provide suggestions grouped
by connected peers/ location
etc.
Existence of Connected Peers
wherever needed.
Rate Suggestions:
Actors Actions Comments (if Applicable)
User [Registered], System User can authenticate
another suggestions.
Take a Poll:
Actors Actions Comments (if Applicable)
User [Registered], System User can participate in +1ing
other suggestions/users.
Google Plus TM user rules
applied.
5. Technical Information
Technology:
●
Build Tools:
●
Web Server:
●
Database:
●
