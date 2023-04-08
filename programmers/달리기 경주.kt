fun solution(players: Array<String>, callings: Array<String>): Array<String> {
  val map: HashMap<String, Int> = HashMap();

  players.forEachIndexed { i, s -> map[s] = i }

  for (p in callings) {
    val rank = map[p]!!
    val prevPlayer = players[rank - 1]

    players[rank - 1] = p
    players[rank] = prevPlayer

    map[prevPlayer] = rank
    map[p] = rank - 1
  }

  return players;
}