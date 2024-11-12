import express = require("express");

const app = express();
const PORT = 3000;

app.get("/", (request: any, response: { send: (arg0: string) => void; }) => {
  response.send("BFF rodando");
})

app.listen(PORT, () => {
  console.log("BFF está rodando na porta "+ PORT);
})