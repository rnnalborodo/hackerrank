-module(solution).
-export([main/0]).

main() ->
  { ok, [N]} = io:fread("", "~d"),
  List = recovering_names([], N),
  print_list(lists:sort(List)).

recovering_names(L,0) ->
  L;
recovering_names(L,N) -> 
  { ok, [Firstname,Emailid]} = io:fread("", "~s~s"),
  RegExp = "^[A-Za-z0-9.]+@gmail.com$",
  case re:run(Emailid, RegExp) of
    {match, _ } ->  recovering_names(L++ [Firstname], N-1);
    nomatch ->  recovering_names(L, N-1)
  end.

print_list([]) ->
  ok;
print_list([H|T]) ->
  io:fwrite("~s~n", [H]),
  print_list(T).
