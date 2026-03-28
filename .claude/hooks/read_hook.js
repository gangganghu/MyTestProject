async function main() {
  const chunks = [];
  for await (const chunk of process.stdin) {
    chunks.push(chunk);
  }

  const toolArgs = JSON.parse(Buffer.concat(chunks).toString());
  const readPath = toolArgs.tool_input?.file_path || toolArgs.tool_input?.path || "";

  //PreToolUse "command": "node .claude/hooks/read_hook.js"
  if (readPath.includes('.txt')) {
    console.error("You cannot read .txt files");
    process.exit(2);
  }
}

main();