-module(solution).
-export([main/0]).

main() ->
  { ok, [N]} = io:fread("", "~d"),
  A = read_array(N,"~d"),
  {ok,[Sorted,Swaps]} = sorting(A),
  io:fwrite("Array is sorted in ~p swaps.~n",[Swaps]),
  io:fwrite("First Element: ~p~n",[lists:nth(1,Sorted)]),
  io:fwrite("Last Element: ~p~n",[lists:nth(length(Sorted),Sorted)]),
  true.

read_array(0,_) -> [];
read_array(N,D) -> 
  {ok, [X]} = io:fread("", D),
  [X | read_array(N-1,D)].

sorting(List) ->
  outer_loop_bubblesort(List, 1, 0).

outer_loop_bubblesort(List, Outer, Swaps) when (length(List) == Outer) ->
  {ok, [List, Swaps]};
outer_loop_bubblesort(List, Outer, Swaps) ->
  {ok, [NewList, NewSwaps]} = inner_sorting(List, 1, 0),
  if (NewSwaps == 0) ->
      {ok, [NewList, Swaps]};
    (true) -> 
      outer_loop_bubblesort(NewList, Outer + 1, Swaps + NewSwaps)
  end.

inner_sorting(List, I, Swaps) when (I == length(List) ) -> {ok, [List, Swaps]};
%inner_sorting(List, I, Swaps) when ((I == length(List)) and (Swaps == 0))-> {ok, [List, Swaps]};
inner_sorting(List, I, Swaps) ->
  %io:fwrite("~p~n", [I]),
  ItemI = lists:nth(I, List),
  ItemIPlus = lists:nth(I+1, List),
  if ( ItemI > ItemIPlus) ->
      Left = lists:sublist(List, 1, I-1),
      Right = lists:sublist(List, I+2, length(List)),
      % io:fwrite("Inner Iteration --> ~p ~p ~n", [Left, Right]),
      NewList =  Left ++ [ItemIPlus, ItemI] ++ Right,
      inner_sorting(NewList, I+1, Swaps+1);
    (true) ->
      inner_sorting(List, I+1, Swaps)
  end.


