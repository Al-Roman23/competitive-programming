class Solution
{
    public int minOperations(String[] logs)
    {
        Stack<String> pathsStack = new Stack<>();

        for (String log : logs)
        {
            if (log.equals("../"))
            {
                if (!pathsStack.isEmpty())
                {
                    pathsStack.pop();
                }
            }
            else if (!log.equals("./"))
            {
                pathsStack.push(log);
            }
        }

        return pathsStack.size();
    }
}
