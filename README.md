*This Project was done as part of a competition. I would like to see through this half-done thing and make it better*

# Beacon

**1. Introduction **

Problem: 

Traffic Jam, a major drawback to our progression through everyday activities has been
more of a frustration than a situation due to the lack of management. It’s a matter of road,
transport facilities and long term solutions, so obviously, blaming the Govt. or respective areas of
law enforcement produced no results. Therefore we have been bearing it as a crown of thorn. It is
not a problem that we can eliminate immediately, but the one we can avoid. “Prevention before
Cure”- as they say.

Solution: 

An alert software that tracks and reports occurrences of traffic jam. It will show specific
routes where jam are occurring real-time (based on internet/GPS services). It will provide alternate
routes to destination based on that tracking.


**2. Scope **

This App Does: 

Users of this app will be Android Phone users who travels using general routes
described in map (Dhaka). This application uses ‘Crowd Sourcing’-a popular survey-based data
collection approach, so 16+ users are more potential sources of data gathering. The system
analyzes the received data and conducts search for options to a specific problem (e.g find and
show routes etc). It will provide a User Interface as per user’s need to navigate through the app,
along with server side assistance.

This App Does NOT: 

It does NOT guarantee a clean, smooth experience in the route it suggested
to the user. It will NOT base its assumptions on direct contact with anyone but the users. It will
NOT cover any route not shown in Google Maps. It can NOT show any suggestions with no user
active. It will NOT work real-time in offline mode.

**3. System Bodies**

1. Users: [UNREGISTERD]

- Can:
 Browse maps and watch suggestion marks on it by others
 Register.

- Can NOT:
 Suggest routes.
 Edit others’ suggestions.
 Rate suggestions by others.
 Take part in polling.
 Find point to point ‘Good’ routes.

2. Users: [REGISTERD]

- Can:
 Log in once. (except after log out)
 Create / Update (after creation) a user profile.
 Create connections with other users
 Browse connected peers’ profiles.
 Suggest routes.
 Rate suggestions by others.
 Take part in polling.
 Find point to point ‘Good’ routes.

- Can NOT:
 Edit others’ suggestions.
 Rate a suggestion twice.
 Communicate with peers through the app.
[NO ADMIN USER WILL BE ALLOTTED EXCEPT IN CASE OF SYSTEM CRASH/FAILURE]

**4. Use cases of the system:**
<table>
  <tr>
   <td>
   </td>
   <td>Actors
   </td>
   <td>Actions
   </td>
   <td>Comments (if Applicable)
   </td>
  </tr>
  <tr>
   <td>Registration
   </td>
   <td>User [Unregistered], System
   </td>
   <td>After information from user is provided, creates an account
   </td>
   <td>Secondary: Google TM login.
   </td>
  </tr>
  <tr>
   <td>Create Profile
   </td>
   <td>User [Registered], System
   </td>
   <td>After information from user is
<p>
provided, creates a profile.
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>Update Profile
   </td>
   <td>User [Registered], System
   </td>
   <td>After prompt, updates a
<p>
profile.
   </td>
   <td>Not applicable if no profile
<p>
exists.
   </td>
  </tr>
  <tr>
   <td>Add suggestion
   </td>
   <td>User [Registered], System
   </td>
   <td>After prompt, user will
<p>
provide binary response.
<p>
System will track his/her
<p>
position and create a
<p>
suggestion.
   </td>
   <td>Future Proposal: Delayed
<p>
Response analysis using AI
   </td>
  </tr>
  <tr>
   <td>Browse Map
   </td>
   <td>User [Registered,
<p>
Unregistered], System
   </td>
   <td>After prompt, System will
<p>
provide a map showing ‘red’
<p>
or ‘green’ routes.
   </td>
   <td>Existence in Google Maps.
   </td>
  </tr>
  <tr>
   <td>Check Route
   </td>
   <td>User [Registered],
   </td>
   <td>System After prompt with specified points (locations), System will
<p>
provide a route (if available)
<p>
with ratings.
   </td>
   <td>Existence in Google Maps.
   </td>
  </tr>
  <tr>
   <td>Search Suggestions:
   </td>
   <td>User [Registered], System
   </td>
   <td>After prompt with
<p>
specification, System will
<p>
provide suggestions grouped
<p>
by connected peers/ location
<p>
etc.
   </td>
   <td>Existence of Connected Peers
<p>
wherever needed.
   </td>
  </tr>
  <tr>
   <td>Rate Suggestions:
   </td>
   <td>User [Registered], System
   </td>
   <td>User can authenticate
<p>
another suggestions.
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>Take a Poll:
   </td>
   <td>User [Registered], System
   </td>
   <td>User can participate in +1ing
<p>
other suggestions/users.
   </td>
   <td>Google Plus TM user rules
<p>
applied.
   </td>
  </tr>
</table>

**5. Technical Information**
Technology: Android
Build Tools: 
Web Server:
Database:
