<template>
    <div class="full-page-container">
      <header class="nav-bar">
        <div class="nav-links">
          
          <router-link :to="{ name: 'AddApplicationsViews' }">Add Applications</router-link>
          <a href="/AddApplicationViews" exact>click here</a>
          <router-link :to="{ name: 'SeeApplicationsViews' }">See Applications</router-link>
          <a href="/SeeApplicationsViews">See Applications link</a>
        </div>
        <div class="contact-button">
          <button class="contact">Contact us!</button>
        </div>
      </header>
    </div>
    <div class="title">
      <h3 class="title-text">APP TRACK</h3>
    </div>
    <router-view/>
  </template>
  
  <script>
  
  
  export default {
    
    components: {
      
    },
  };
  </script>
  
  <style scoped>
  body {
    margin: 0;
    background-color: whitesmoke;
  }
  
  .nav-bar {
    display: flex;
    box-shadow: 0px 2px 4px rgba(0, 0, 0, 0.2);
    border: 1px solid white;
    background-color: white;
    justify-content: space-between;
    position: fixed;
    width: 98.5%;
    z-index: 1000;
    height: 50px;
    
  }
  
  .nav-links {
    display: flex;
    flex-wrap: wrap;
    align-items: center; 
    font-family: monospace;
  }
  
  .nav-links a:hover,
  .nav-links router-link:hover {
    text-decoration: underline 2px rgba(92, 212, 246, 0.8);
  }
  
  .nav-links a,
  .nav-links router-link {
    margin-right: 20px; 
    text-decoration: none;
    color: black; 
  }
  
  .contact-button {
    display: flex;
    justify-content: flex-end;
    align-items: center;
    padding-right: 10px; 
  }
  
  .contact {
    display: flex;
    height: 40px;
    border-radius: 5px;
    text-align: center;
    align-items: center;
    padding: 5px 10px; 
    background-color: rgb(92, 212, 246);
    color: whitesmoke;
  }
  
  .full-page-container {
    display: flex;
    padding-top: 5px; 
  }
  
  .title {
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 4rem;
    padding-top: 30px;
    text-shadow: 1px 2px 2px rgba(92, 212, 246, 0.8);
    color: transparent;
    font-family: monospace;
    border: 1px solid grey;
    height: 75px;
    padding-top: 55px;
    margin-top: 60px; /* Adjust margin-top to create space between nav bar and title */
  }
  
  .title-text {
    display: flex;
    justify-content: center;
    align-items: center;
    padding-bottom: 60px;
  }
  </style>