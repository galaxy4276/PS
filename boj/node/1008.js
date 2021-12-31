const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on('line', line => { 
  const nums = line.split(' ').map(v => parseInt(v));
  console.log(nums[0] / nums[1]);
  rl.close();
})
.on('close', () => {
    process.exit();
});
