-module(solution).
-export([main/0]).

main() ->
  io:fwrite("~p ~n",[5]),

  io:fwrite("~p ~p ~n",[4,3]),%YES
  io:fwrite("~p ~p ~p ~p ~n",[-1,3,0,2]),

  io:fwrite("~p ~p ~n",[5,1]),%NO
  io:fwrite("~p ~p ~p ~p ~p ~n",[0,-1,2,1,4]),

  io:fwrite("~p ~p ~n",[8,3]),%YES
  io:fwrite("~p ~p ~p ~p ~p ~p ~p ~p ~n",[-3,0,2,3,4,5,6,7]),

  io:fwrite("~p ~p ~n",[7,5]),%NO
  io:fwrite("~p ~p ~p ~p ~p ~p ~p ~n",[0,-1,-3,-4,-2,3,4]),

  io:fwrite("~p ~p ~n",[6,4]),%YES
  io:fwrite("~p ~p ~p ~p ~p ~p ~n",[-1,0,4,2,9,10]),
  ok.

