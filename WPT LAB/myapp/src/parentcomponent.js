import React, { useState } from "react";
import ChildComponent from "./childcomponent";

function ParentComponent() {
  const [num1, setNum1] = useState("");
  const [num2, setNum2] = useState("");
  const [result, setResult] = useState("");

  const calculate = (operation) => {
    let n1 = parseFloat(num1);
    let n2 = parseFloat(num2);

    if (isNaN(n1) || isNaN(n2)) {
      setResult("Enter valid numbers");
      return;
    }

    let res;
    switch (operation) {
      case "add":
        res = n1 + n2;
        break;
      case "sub":
        res = n1 - n2;
        break;
      case "mul":
        res = n1 * n2;
        break;
      case "div":
        res = n2 !== 0 ? n1 / n2 : "Cannot divide by 0";
        break;
      default:
        res = "";
    }

    setResult(res);
  };

  return (
    <div>
      <h2>Calculator</h2>

      <input
        type="number"
        placeholder="Enter first number"
        onChange={(e) => setNum1(e.target.value)}
      />

      <input
        type="number"
        placeholder="Enter second number"
        onChange={(e) => setNum2(e.target.value)}
      />

      <br /><br />

      <ChildComponent onSelect={calculate} />

      <h3>Result: {result}</h3>
    </div>
  );
}

export default ParentComponent;