import React from "react";

function ChildComponent({ onSelect }) {
  return (
    <select onChange={(e) => onSelect(e.target.value)}>
      <option value="">Select Operation</option>
      <option value="add">Addition</option>
      <option value="sub">Subtraction</option>
      <option value="mul">Multiplication</option>
      <option value="div">Division</option>
    </select>
  );
}

export default ChildComponent;