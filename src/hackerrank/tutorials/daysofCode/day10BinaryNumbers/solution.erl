-module(solution).
-export([main/0]).

main() ->

  { ok, [N]} = io:fread("", "~d"),
  io:fwrite("~p", [converting_binary(N, 0, 0)]),
  true.

converting_binary(0,_, Max) -> Max;
converting_binary(1,Count, Max) -> erlang:max(Count+1,Max);
converting_binary(N,Count, Max) -> 
  Remainder = N rem 2,
  Sum = N div 2,
  if (Remainder == 1) ->
      converting_binary(Sum,Count+1, Max);
    % Remainder == 0
    (true) ->
      converting_binary(Sum,0, erlang:max(Count,Max))
  end.