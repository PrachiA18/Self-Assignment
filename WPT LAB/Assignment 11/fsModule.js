
const fs = require('fs');

// readdir
fs.readdir('./', (err, files) => {
  if (err) throw err;
  console.log(files);
});

// stat
fs.stat('employee.js', (err, stats) => {
  if (err) throw err;

  if (stats.isDirectory()) {
    console.log('It is a directory');
  }
});