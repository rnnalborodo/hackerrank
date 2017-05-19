-module(solution).
-export([main/0]).

main() ->
  { ok, [T]} = io:fread("", "~d"),
  T_list = lists:seq(1,T),
  lists:foreach( fun(_) ->
                   { ok, [N]} = io:fread("", "~d"),
                   Result = check_prime(N),
                   if (Result)
                     -> io:fwrite("Prime~n",[]) ;
                     (true) ->io:fwrite("Not prime~n",[])
                   end
                 end,T_list),
  true.

check_prime(1) -> false;
check_prime(2) -> true;
check_prime(X) when (X rem 2 == 0) -> false;
check_prime(N) -> 
  %io:fwrite("N --> ~p~n",[N]),
  Sqrt = math:sqrt(N),
  %io:fwrite("      ~p~n",[round(Sqrt)]),
  inner_prime(3, N,trunc(Sqrt)).
  % % get all of the odd numbers in that range instead.
  % List = lists:seq(3,trunc(Sqrt),2),
  % List_Divisors = lists:filter( fun(N0) -> N rem N0 == 0 end,List),
  % (length(List_Divisors) == 0).

inner_prime(X,_, Sqrt) when (X > Sqrt) -> true;
inner_prime(X, N, Sqrt) -> 
  %io:fwrite("~p rem ~p~n",[X,N]),
  if (N rem X == 0) -> false;
    (true) -> inner_prime(X+2, N, Sqrt)
  end.
