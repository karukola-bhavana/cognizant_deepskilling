import React from "react";

function BookDetails() {
  return (
      <div>
        <h2>Book Details</h2>

        <ul>
          <li>React Guide</li>
          <li>Java Complete Reference</li>
        </ul>
      </div>
  );
}

function BlogDetails() {
  return (
      <div>
        <h2>Blog Details</h2>

        <ul>
          <li>React Hooks Blog</li>
          <li>JavaScript ES6 Blog</li>
        </ul>
      </div>
  );
}

function CourseDetails() {
  return (
      <div>
        <h2>Course Details</h2>

        <ul>
          <li>React Training</li>
          <li>Spring Boot Training</li>
        </ul>
      </div>
  );
}

function App() {

  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  return (
      <div>

        <h1>Blogger App</h1>

        {showBooks && <BookDetails />}

        {showBlogs
            ? <BlogDetails />
            : <h3>No Blogs Available</h3>}

        {showCourses
            ? <CourseDetails />
            : null}

      </div>
  );
}

export default App;