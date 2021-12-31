const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on('line', input => {
  const line = input.toLocaleLowerCase();
  if (line.includes('0')) rl.close();
  const reversed = line.split("").reverse().join("");

  for (let i = line.length - 1; i >= 0; i--)
    if (line[i] !== reversed[i]) return console.log('no');
  console.log('yes');
})
  .on('close', () => process.exit());
