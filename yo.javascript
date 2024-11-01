// URLs for cursor images
const defaultCursorURL = "https://raw.githubusercontent.com/berrizscript/images-and-/refs/heads/main/default.svg";
const pointerCursorURL = "https://raw.githubusercontent.com/berrizscript/images-and-/refs/heads/main/handpointing.svg";

// Create a custom cursor element
const customCursor = document.createElement("img");
customCursor.style.position = "absolute";
customCursor.style.pointerEvents = "none";
customCursor.style.zIndex = "1000";
customCursor.style.width = "32px"; // Adjust the size as needed
customCursor.style.height = "32px";
customCursor.src = defaultCursorURL;
document.body.appendChild(customCursor);

// Hide the default cursor
document.body.style.cursor = "none"; // This hides the default pointer cursor

// Update the position of the custom cursor
document.addEventListener("mousemove", (event) => {
  customCursor.style.left = `${event.pageX}px`;
  customCursor.style.top = `${event.pageY}px`;
});

// Detect and change to custom pointer image on clickable elements
document.addEventListener("mouseover", (event) => {
  if (event.target.matches("a, button") || event.target.hasAttribute("onclick")) {
    customCursor.src = pointerCursorURL;
  } else {
    customCursor.src = defaultCursorURL;
  }
});
