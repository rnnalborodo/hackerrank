-module(solution).
-export([main/0]).

main() ->
  { ok, [T]} = io:fread("", "~d"),
  T_list = lists:seq(1,T),
  % just an iteration over T items
  lists:foreach( fun(T0) ->
                   { ok, [N,K]} = io:fread("", "~d~d"),
                   if ((((K-1) bor K) > N) and (K rem 2 == 0)) ->io:fwrite("~p~n", [K-2]);
                       (true) -> io:fwrite("~p~n", [K-1])
                   end
                 end,
                T_list),
  ok.
